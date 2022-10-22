package typingsJapgolly.matrixAppserviceBridge

import typingsJapgolly.matrixAppserviceBridge.anon.Roomid
import typingsJapgolly.matrixAppserviceBridge.anon.Sender
import typingsJapgolly.matrixAppserviceBridge.libComponentsRoomBridgeStoreMod.RoomBridgeStoreEntry
import typingsJapgolly.matrixAppserviceBridge.mod.Bridge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsRoomUpgradeHandlerMod {
  
  @JSImport("matrix-appservice-bridge/lib/components/room-upgrade-handler", "RoomUpgradeHandler")
  @js.native
  open class RoomUpgradeHandler protected () extends StObject {
    /**
      * @param {RoomUpgradeHandler~Options} opts
      * @param {Bridge} bridge The parent bridge.
      */
    def this(opts: RoomUpgradeHandlerOpts, bridge: Bridge) = this()
    
    /* private */ val bridge: Any = js.native
    
    /* private */ var joinNewRoom: Any = js.native
    
    /* private */ var migrateEntry: Any = js.native
    
    /* private */ var migrateStoreEntries: Any = js.native
    
    /**
      * Called when an invite event reaches the bridge. This function
      * will check if the invite is from an upgraded room, and will
      * join the room if so.
      * @param ev A Matrix m.room.member event of membership=invite
      *           directed to the bridge bot
      * @return True if the invite is from an upgraded room and shouldn't
      * be processed.
      */
    def onInvite(ev: Roomid): js.Promise[Boolean] = js.native
    
    /* private */ var onJoinedNewRoom: Any = js.native
    
    /**
      * Called when the bridge sees a "m.room.tombstone" event.
      * @param ev The m.room.tombstone event.
      */
    def onTombstone(ev: Sender): js.Promise[Boolean] = js.native
    
    /* private */ val opts: Any = js.native
    
    /* private */ var waitingForInvite: Any = js.native
  }
  
  trait RoomUpgradeHandlerOpts extends StObject {
    
    /**
      * Should upgrade and invite events be processed after being handled
      * by the RoomUpgradeHandler. Defaults to `false`.
      */
    var consumeEvent: Boolean
    
    /**
      * Invoked when iterating around a rooms entries. Should be used to update entries
      * with a new room id.
      *
      * @param entry The existing entry.
      * @param newRoomId The new roomId.
      * @return Return the entry to upsert it,
      * or null to ignore it.
      */
    var migrateEntry: js.UndefOr[
        js.Function2[
          /* entry */ RoomBridgeStoreEntry, 
          /* newRoomId */ String, 
          js.Promise[RoomBridgeStoreEntry | Null]
        ]
      ] = js.undefined
    
    /**
      * Should ghost users be migrated to the new room. This will leave
      * any users matching the user regex list in the registration file
      * from the old room, and join them to the new room.
      * Defaults to `true`
      */
    var migrateGhosts: Boolean
    
    /**
      * Migrate room store entries automatically. Defaults to `true`
      */
    var migrateStoreEntries: Boolean
    
    /**
      * Invoked after a room has been upgraded and its entries updated.
      *
      * @param oldRoomId The old roomId.
      * @param newRoomId The new roomId.
      */
    var onRoomMigrated: js.UndefOr[
        js.Function2[/* oldRoomId */ String, /* newRoomId */ String, js.Promise[Unit] | Unit]
      ] = js.undefined
  }
  object RoomUpgradeHandlerOpts {
    
    inline def apply(consumeEvent: Boolean, migrateGhosts: Boolean, migrateStoreEntries: Boolean): RoomUpgradeHandlerOpts = {
      val __obj = js.Dynamic.literal(consumeEvent = consumeEvent.asInstanceOf[js.Any], migrateGhosts = migrateGhosts.asInstanceOf[js.Any], migrateStoreEntries = migrateStoreEntries.asInstanceOf[js.Any])
      __obj.asInstanceOf[RoomUpgradeHandlerOpts]
    }
    
    extension [Self <: RoomUpgradeHandlerOpts](x: Self) {
      
      inline def setConsumeEvent(value: Boolean): Self = StObject.set(x, "consumeEvent", value.asInstanceOf[js.Any])
      
      inline def setMigrateEntry(
        value: (/* entry */ RoomBridgeStoreEntry, /* newRoomId */ String) => js.Promise[RoomBridgeStoreEntry | Null]
      ): Self = StObject.set(x, "migrateEntry", js.Any.fromFunction2(value))
      
      inline def setMigrateEntryUndefined: Self = StObject.set(x, "migrateEntry", js.undefined)
      
      inline def setMigrateGhosts(value: Boolean): Self = StObject.set(x, "migrateGhosts", value.asInstanceOf[js.Any])
      
      inline def setMigrateStoreEntries(value: Boolean): Self = StObject.set(x, "migrateStoreEntries", value.asInstanceOf[js.Any])
      
      inline def setOnRoomMigrated(value: (/* oldRoomId */ String, /* newRoomId */ String) => js.Promise[Unit] | Unit): Self = StObject.set(x, "onRoomMigrated", js.Any.fromFunction2(value))
      
      inline def setOnRoomMigratedUndefined: Self = StObject.set(x, "onRoomMigrated", js.undefined)
    }
  }
}
