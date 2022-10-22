package typingsJapgolly.ts3NodejsLibrary

import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.ts3NodejsLibrary.anon.Sgid
import typingsJapgolly.ts3NodejsLibrary.libNodeAbstractMod.Abstract
import typingsJapgolly.ts3NodejsLibrary.libNodeClientMod.TeamSpeakClient.ClientType
import typingsJapgolly.ts3NodejsLibrary.libTeamSpeakMod.TeamSpeak
import typingsJapgolly.ts3NodejsLibrary.libTypesResponseTypesMod.ServerGroupClientEntry
import typingsJapgolly.ts3NodejsLibrary.libTypesResponseTypesMod.ServerGroupCopy
import typingsJapgolly.ts3NodejsLibrary.libTypesResponseTypesMod.ServerGroupEntry
import typingsJapgolly.ts3NodejsLibrary.libUtilPermissionMod.Permission
import typingsJapgolly.ts3NodejsLibrary.libUtilPermissionMod.Permission.PermType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNodeServerGroupMod {
  
  @JSImport("ts3-nodejs-library/lib/node/ServerGroup", "TeamSpeakServerGroup")
  @js.native
  open class TeamSpeakServerGroup protected () extends Abstract[ServerGroupEntry] {
    def this(parent: TeamSpeak, list: ServerGroupEntry) = this()
    
    /**
      * Adds a client to the server group. Please note that a client cannot be added to default groups or template groups.
      * @param client the client database id which should be added to the Group
      */
    def addClient(client: ClientType): js.Promise[js.Array[Any]] = js.native
    
    /**
      * Adds a specified permissions to the server group.
      * A permission can be specified by permid or permsid.
      * @param perm the permission object to set
      */
    def addPerm(perm: PermType): js.Promise[js.Array[Any]] = js.native
    
    /** returns the ids of all clients currently residing in the server group */
    def clientList(): js.Promise[js.Array[ServerGroupClientEntry]] = js.native
    
    /**
      * Creates a copy of the server group specified with ssgid. If tsgid is set to 0, the server will create a new group.
      * To overwrite an existing group, simply set tsgid to the ID of a designated target group.
      * If a target group is set, the name parameter will be ignored.
      * @param tsgid the target group, 0 to create a new group
      * @param type type of the group (0 = Query Group | 1 = Normal Group)
      * @param name name of the group
      */
    def copy(targetGroup: String, `type`: Double, name: String): js.Promise[ServerGroupCopy] = js.native
    def copy(targetGroup: TeamSpeakServerGroup, `type`: Double, name: String): js.Promise[ServerGroupCopy] = js.native
    
    /**
      * Adds a specified permissions to the server group.
      * A permission can be specified by permid or permsid.
      */
    def createPerm(): Permission[Any] = js.native
    
    /**
      * Deletes the server group.
      * If force is set to 1, the server group will be deleted even if there are clients within.
      * @param force if set to 1 the servergroup will be deleted even when clients are in it
      */
    def del(): js.Promise[js.Array[Any]] = js.native
    def del(force: Boolean): js.Promise[js.Array[Any]] = js.native
    
    /**
      * removes a client specified with cldbid from the servergroup
      * @param client the client database id which should be removed from the group
      */
    def delClient(client: ClientType): js.Promise[js.Array[Any]] = js.native
    
    /**
      * rmoves a set of specified permissions from the server group.
      * A permission can be specified by permid or permsid.
      * @param perm the permid or permsid
      */
    def delPerm(perm: String): js.Promise[js.Array[Any]] = js.native
    def delPerm(perm: Double): js.Promise[js.Array[Any]] = js.native
    
    /** returns a buffer with the icon of the servergroup */
    def getIcon(): js.Promise[Buffer] = js.native
    
    /** gets the icon id of the servergroup */
    def getIconId(): js.Promise[Double] = js.native
    
    def iconid: String = js.native
    
    def nMemberAddp: Double = js.native
    
    def nMemberRemovep: Double = js.native
    
    def nModifyp: Double = js.native
    
    def name: String = js.native
    
    def namemode: Double = js.native
    
    /**
      * returns a list of permissions assigned to the server group specified with sgid
      * @param permsid if the permsid option is set to true the output will contain the permission names
      */
    def permList(permsid: Boolean): js.Promise[js.Array[Permission[Sgid]]] = js.native
    
    /**
      * changes the name of the server group
      * @param name new name of the group
      */
    def rename(name: String): js.Promise[js.Array[Any]] = js.native
    
    def savedb: Double = js.native
    
    def sgid: String = js.native
    
    def sortid: Double = js.native
    
    def `type`: Double = js.native
  }
  /* static members */
  object TeamSpeakServerGroup {
    
    @JSImport("ts3-nodejs-library/lib/node/ServerGroup", "TeamSpeakServerGroup")
    @js.native
    val ^ : js.Any = js.native
    
    /** retrieves the client id from a string or teamspeak client */
    inline def getId[T /* <: GroupType */](): /* import warning: importer.ImportType#apply Failed type conversion: T extends undefined ? undefined : string */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getId")().asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T extends undefined ? undefined : string */ js.Any]
    inline def getId[T /* <: GroupType */](group: T): /* import warning: importer.ImportType#apply Failed type conversion: T extends undefined ? undefined : string */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getId")(group.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T extends undefined ? undefined : string */ js.Any]
    
    /** retrieves the clients from an array */
    inline def getMultipleIds(groups: MultiGroupType): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMultipleIds")(groups.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    
    type GroupType = String | TeamSpeakServerGroup
    
    type MultiGroupType = (js.Array[String | TeamSpeakServerGroup]) | GroupType
  }
}
