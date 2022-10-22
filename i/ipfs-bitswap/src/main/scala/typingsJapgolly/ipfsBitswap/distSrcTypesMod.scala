package typingsJapgolly.ipfsBitswap

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.interfaceBlockstore.mod.Blockstore
import typingsJapgolly.interfaceStore.mod.Store
import typingsJapgolly.libp2pInterfacePeerId.mod.PeerId
import typingsJapgolly.multiformats.distTypesSrcLinkInterfaceMod.Version
import typingsJapgolly.multiformats.mod.CID
import typingsJapgolly.std.IterableIterator
import typingsJapgolly.std.Map
import typingsJapgolly.std.Record
import typingsJapgolly.vascosantosMovingAverage.mod.IMovingAverage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesMod {
  
  @js.native
  trait IPFSBitswap
    extends StObject
       with Store[CID[Any, Double, Double, Version], js.typedarray.Uint8Array] {
    
    def cancelWants(cids: js.Array[typingsJapgolly.multiformats.cidMod.CID[Any, Double, Double, Version]]): Unit = js.native
    def cancelWants(cids: typingsJapgolly.multiformats.cidMod.CID[Any, Double, Double, Version]): Unit = js.native
    
    def disableStats(): Unit = js.native
    
    def enableStats(): Unit = js.native
    
    def getWantlist(): IterableIterator[js.Tuple2[String, WantListEntry]] = js.native
    
    def isStarted(): Boolean = js.native
    
    def ledgerForPeer(peerId: PeerId): Ledger | Null = js.native
    
    var peerId: PeerId = js.native
    
    def peers(): js.Array[PeerId] = js.native
    
    def start(): Unit = js.native
    
    def stat(): Stats = js.native
    
    def stop(): Unit = js.native
    
    def unwant(cids: js.Array[typingsJapgolly.multiformats.cidMod.CID[Any, Double, Double, Version]]): Unit = js.native
    def unwant(cids: typingsJapgolly.multiformats.cidMod.CID[Any, Double, Double, Version]): Unit = js.native
    
    def unwrap(): Blockstore = js.native
    
    def wantlistForPeer(peerId: PeerId): Map[String, WantListEntry] = js.native
  }
  
  trait Ledger extends StObject {
    
    var exchanged: Double
    
    var peer: PeerId
    
    var recv: Double
    
    var sent: Double
    
    var value: Double
  }
  object Ledger {
    
    inline def apply(exchanged: Double, peer: PeerId, recv: Double, sent: Double, value: Double): Ledger = {
      val __obj = js.Dynamic.literal(exchanged = exchanged.asInstanceOf[js.Any], peer = peer.asInstanceOf[js.Any], recv = recv.asInstanceOf[js.Any], sent = sent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ledger]
    }
    
    extension [Self <: Ledger](x: Self) {
      
      inline def setExchanged(value: Double): Self = StObject.set(x, "exchanged", value.asInstanceOf[js.Any])
      
      inline def setPeer(value: PeerId): Self = StObject.set(x, "peer", value.asInstanceOf[js.Any])
      
      inline def setRecv(value: Double): Self = StObject.set(x, "recv", value.asInstanceOf[js.Any])
      
      inline def setSent(value: Double): Self = StObject.set(x, "sent", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MultihashHasherLoader extends StObject {
    
    def getHasher(codeOrName: String): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MultihashHasher */ Any
      ] = js.native
    def getHasher(codeOrName: Double): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MultihashHasher */ Any
      ] = js.native
  }
  
  trait Stat extends StObject {
    
    def disable(): Unit
    
    def enable(): Unit
    
    var movingAverages: Record[String, Record[Double, IMovingAverage]]
    
    def push(counter: String, inc: Double): Unit
    
    var snapshot: Record[String, js.BigInt]
    
    def stop(): Unit
  }
  object Stat {
    
    inline def apply(
      disable: Callback,
      enable: Callback,
      movingAverages: Record[String, Record[Double, IMovingAverage]],
      push: (String, Double) => Callback,
      snapshot: Record[String, js.BigInt],
      stop: Callback
    ): Stat = {
      val __obj = js.Dynamic.literal(disable = disable.toJsFn, enable = enable.toJsFn, movingAverages = movingAverages.asInstanceOf[js.Any], push = js.Any.fromFunction2((t0: String, t1: Double) => (push(t0, t1)).runNow()), snapshot = snapshot.asInstanceOf[js.Any], stop = stop.toJsFn)
      __obj.asInstanceOf[Stat]
    }
    
    extension [Self <: Stat](x: Self) {
      
      inline def setDisable(value: Callback): Self = StObject.set(x, "disable", value.toJsFn)
      
      inline def setEnable(value: Callback): Self = StObject.set(x, "enable", value.toJsFn)
      
      inline def setMovingAverages(value: Record[String, Record[Double, IMovingAverage]]): Self = StObject.set(x, "movingAverages", value.asInstanceOf[js.Any])
      
      inline def setPush(value: (String, Double) => Callback): Self = StObject.set(x, "push", js.Any.fromFunction2((t0: String, t1: Double) => (value(t0, t1)).runNow()))
      
      inline def setSnapshot(value: Record[String, js.BigInt]): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
      
      inline def setStop(value: Callback): Self = StObject.set(x, "stop", value.toJsFn)
    }
  }
  
  @js.native
  trait Stats extends StObject {
    
    def disable(): Unit = js.native
    
    def enable(): Unit = js.native
    
    def forPeer(peerId: String): js.UndefOr[Stat] = js.native
    def forPeer(peerId: PeerId): js.UndefOr[Stat] = js.native
    
    var movingAverages: Record[String, Record[Double, IMovingAverage]] = js.native
    
    def push(peer: String, counter: String, inc: Double): Unit = js.native
    
    var snapshot: Record[String, js.BigInt] = js.native
    
    def stop(): Unit = js.native
  }
  
  trait WantListEntry extends StObject {
    
    var cid: typingsJapgolly.multiformats.cidMod.CID[Any, Double, Double, Version]
    
    def dec(): Unit
    
    def hasRefs(): Boolean
    
    def inc(): Unit
    
    var priority: Double
    
    var wantType: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Message.Wantlist.WantType */ Any
  }
  object WantListEntry {
    
    inline def apply(
      cid: typingsJapgolly.multiformats.cidMod.CID[Any, Double, Double, Version],
      dec: Callback,
      hasRefs: CallbackTo[Boolean],
      inc: Callback,
      priority: Double,
      wantType: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Message.Wantlist.WantType */ Any
    ): WantListEntry = {
      val __obj = js.Dynamic.literal(cid = cid.asInstanceOf[js.Any], dec = dec.toJsFn, hasRefs = hasRefs.toJsFn, inc = inc.toJsFn, priority = priority.asInstanceOf[js.Any], wantType = wantType.asInstanceOf[js.Any])
      __obj.asInstanceOf[WantListEntry]
    }
    
    extension [Self <: WantListEntry](x: Self) {
      
      inline def setCid(value: typingsJapgolly.multiformats.cidMod.CID[Any, Double, Double, Version]): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
      
      inline def setDec(value: Callback): Self = StObject.set(x, "dec", value.toJsFn)
      
      inline def setHasRefs(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasRefs", value.toJsFn)
      
      inline def setInc(value: Callback): Self = StObject.set(x, "inc", value.toJsFn)
      
      inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setWantType(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Message.Wantlist.WantType */ Any
      ): Self = StObject.set(x, "wantType", value.asInstanceOf[js.Any])
    }
  }
  
  trait Wantlist extends StObject {
    
    def add(
      cid: typingsJapgolly.multiformats.cidMod.CID[Any, Double, Double, Version],
      priority: Double,
      wantType: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Message.Wantlist.WantType */ Any
    ): Unit
    
    def contains(cid: typingsJapgolly.multiformats.cidMod.CID[Any, Double, Double, Version]): Boolean
    
    def forEach(fn: js.Function2[/* entry */ WantListEntry, /* key */ String, Unit]): Unit
    
    def get(cid: typingsJapgolly.multiformats.cidMod.CID[Any, Double, Double, Version]): WantListEntry
    
    var length: Double
    
    def remove(cid: typingsJapgolly.multiformats.cidMod.CID[Any, Double, Double, Version]): Unit
    
    def removeForce(cid: String): Unit
    
    def sortedEntries(): Map[String, WantListEntry]
  }
  object Wantlist {
    
    inline def apply(
      add: (typingsJapgolly.multiformats.cidMod.CID[Any, Double, Double, Version], Double, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Message.Wantlist.WantType */ Any) => Callback,
      contains: typingsJapgolly.multiformats.cidMod.CID[Any, Double, Double, Version] => Boolean,
      forEach: js.Function2[/* entry */ WantListEntry, /* key */ String, Unit] => Callback,
      get: typingsJapgolly.multiformats.cidMod.CID[Any, Double, Double, Version] => WantListEntry,
      length: Double,
      remove: typingsJapgolly.multiformats.cidMod.CID[Any, Double, Double, Version] => Callback,
      removeForce: String => Callback,
      sortedEntries: CallbackTo[Map[String, WantListEntry]]
    ): Wantlist = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction3((t0: typingsJapgolly.multiformats.cidMod.CID[Any, Double, Double, Version], t1: Double, t2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Message.Wantlist.WantType */ Any) => (add(t0, t1, t2)).runNow()), contains = js.Any.fromFunction1(contains), forEach = js.Any.fromFunction1((t0: js.Function2[/* entry */ WantListEntry, /* key */ String, Unit]) => forEach(t0).runNow()), get = js.Any.fromFunction1(get), length = length.asInstanceOf[js.Any], remove = js.Any.fromFunction1((t0: typingsJapgolly.multiformats.cidMod.CID[Any, Double, Double, Version]) => remove(t0).runNow()), removeForce = js.Any.fromFunction1((t0: String) => removeForce(t0).runNow()), sortedEntries = sortedEntries.toJsFn)
      __obj.asInstanceOf[Wantlist]
    }
    
    extension [Self <: Wantlist](x: Self) {
      
      inline def setAdd(
        value: (typingsJapgolly.multiformats.cidMod.CID[Any, Double, Double, Version], Double, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Message.Wantlist.WantType */ Any) => Callback
      ): Self = StObject.set(x, "add", js.Any.fromFunction3((t0: typingsJapgolly.multiformats.cidMod.CID[Any, Double, Double, Version], t1: Double, t2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Message.Wantlist.WantType */ Any) => (value(t0, t1, t2)).runNow()))
      
      inline def setContains(value: typingsJapgolly.multiformats.cidMod.CID[Any, Double, Double, Version] => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
      
      inline def setForEach(value: js.Function2[/* entry */ WantListEntry, /* key */ String, Unit] => Callback): Self = StObject.set(x, "forEach", js.Any.fromFunction1((t0: js.Function2[/* entry */ WantListEntry, /* key */ String, Unit]) => value(t0).runNow()))
      
      inline def setGet(value: typingsJapgolly.multiformats.cidMod.CID[Any, Double, Double, Version] => WantListEntry): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setRemove(value: typingsJapgolly.multiformats.cidMod.CID[Any, Double, Double, Version] => Callback): Self = StObject.set(x, "remove", js.Any.fromFunction1((t0: typingsJapgolly.multiformats.cidMod.CID[Any, Double, Double, Version]) => value(t0).runNow()))
      
      inline def setRemoveForce(value: String => Callback): Self = StObject.set(x, "removeForce", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setSortedEntries(value: CallbackTo[Map[String, WantListEntry]]): Self = StObject.set(x, "sortedEntries", value.toJsFn)
    }
  }
}
