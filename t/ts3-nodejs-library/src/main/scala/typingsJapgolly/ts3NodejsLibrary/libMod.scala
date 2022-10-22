package typingsJapgolly.ts3NodejsLibrary

import typingsJapgolly.std.Partial
import typingsJapgolly.ts3NodejsLibrary.anon.PartialConnectionParams
import typingsJapgolly.ts3NodejsLibrary.libNodeChannelGroupMod.TeamSpeakChannelGroup.GroupType
import typingsJapgolly.ts3NodejsLibrary.libNodeChannelGroupMod.TeamSpeakChannelGroup.MultiGroupType
import typingsJapgolly.ts3NodejsLibrary.libNodeChannelMod.TeamSpeakChannel.ChannelType
import typingsJapgolly.ts3NodejsLibrary.libNodeChannelMod.TeamSpeakChannel.MultiChannelType
import typingsJapgolly.ts3NodejsLibrary.libNodeClientMod.TeamSpeakClient.ClientType
import typingsJapgolly.ts3NodejsLibrary.libNodeClientMod.TeamSpeakClient.MultiClientType
import typingsJapgolly.ts3NodejsLibrary.libNodeServerMod.TeamSpeakServer.MultiServerType
import typingsJapgolly.ts3NodejsLibrary.libNodeServerMod.TeamSpeakServer.ServerType
import typingsJapgolly.ts3NodejsLibrary.libTransportTeamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import typingsJapgolly.ts3NodejsLibrary.libTypesResponseTypesMod.ChannelEntry
import typingsJapgolly.ts3NodejsLibrary.libTypesResponseTypesMod.ChannelGroupEntry
import typingsJapgolly.ts3NodejsLibrary.libTypesResponseTypesMod.ClientEntry
import typingsJapgolly.ts3NodejsLibrary.libTypesResponseTypesMod.QueryErrorMessage
import typingsJapgolly.ts3NodejsLibrary.libTypesResponseTypesMod.ServerEntry
import typingsJapgolly.ts3NodejsLibrary.libTypesResponseTypesMod.ServerGroupEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("ts3-nodejs-library/lib", "ClientType")
  @js.native
  object ClientType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ts3NodejsLibrary.libTypesEnumMod.ClientType & Double] = js.native
    
    /* 0 */ val Regular: typingsJapgolly.ts3NodejsLibrary.libTypesEnumMod.ClientType.Regular & Double = js.native
    
    /* 1 */ val ServerQuery: typingsJapgolly.ts3NodejsLibrary.libTypesEnumMod.ClientType.ServerQuery & Double = js.native
  }
  
  @JSImport("ts3-nodejs-library/lib", "Codec")
  @js.native
  object Codec extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ts3NodejsLibrary.libTypesEnumMod.Codec & Double] = js.native
    
    /* 3 */ val CELT_MONO: typingsJapgolly.ts3NodejsLibrary.libTypesEnumMod.Codec.CELT_MONO & Double = js.native
    
    /* 5 */ val OPUS_MUSIC: typingsJapgolly.ts3NodejsLibrary.libTypesEnumMod.Codec.OPUS_MUSIC & Double = js.native
    
    /* 4 */ val OPUS_VOICE: typingsJapgolly.ts3NodejsLibrary.libTypesEnumMod.Codec.OPUS_VOICE & Double = js.native
    
    /* 0 */ val SPEEX_NARROWBAND: typingsJapgolly.ts3NodejsLibrary.libTypesEnumMod.Codec.SPEEX_NARROWBAND & Double = js.native
    
    /* 2 */ val SPEEX_ULTRAWIDEBAND: typingsJapgolly.ts3NodejsLibrary.libTypesEnumMod.Codec.SPEEX_ULTRAWIDEBAND & Double = js.native
    
    /* 1 */ val SPEEX_WIDEBAND: typingsJapgolly.ts3NodejsLibrary.libTypesEnumMod.Codec.SPEEX_WIDEBAND & Double = js.native
  }
  
  @JSImport("ts3-nodejs-library/lib", "CodecEncryptionMode")
  @js.native
  object CodecEncryptionMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ts3NodejsLibrary.libTypesEnumMod.CodecEncryptionMode & Double] = js.native
    
    /* 1 */ val DISABLED: typingsJapgolly.ts3NodejsLibrary.libTypesEnumMod.CodecEncryptionMode.DISABLED & Double = js.native
    
    /* 2 */ val ENABLED: typingsJapgolly.ts3NodejsLibrary.libTypesEnumMod.CodecEncryptionMode.ENABLED & Double = js.native
    
    /* 0 */ val INDIVIDUAL: typingsJapgolly.ts3NodejsLibrary.libTypesEnumMod.CodecEncryptionMode.INDIVIDUAL & Double = js.native
  }
  
  @JSImport("ts3-nodejs-library/lib", "EventError")
  @js.native
  open class EventError protected ()
    extends typingsJapgolly.ts3NodejsLibrary.libExceptionEventErrorMod.EventError {
    /**
      * @param message error message
      * @param eventName source event of this error
      */
    def this(message: String, eventName: String) = this()
  }
  
  @JSImport("ts3-nodejs-library/lib", "HostBannerMode")
  @js.native
  object HostBannerMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ts3NodejsLibrary.libTypesEnumMod.HostBannerMode & Double] = js.native
    
    /* 1 */ val IGNOREASPECT: typingsJapgolly.ts3NodejsLibrary.libTypesEnumMod.HostBannerMode.IGNOREASPECT & Double = js.native
    
    /* 2 */ val KEEPASPECT: typingsJapgolly.ts3NodejsLibrary.libTypesEnumMod.HostBannerMode.KEEPASPECT & Double = js.native
    
    /* 0 */ val NOADJUST: typingsJapgolly.ts3NodejsLibrary.libTypesEnumMod.HostBannerMode.NOADJUST & Double = js.native
  }
  
  @JSImport("ts3-nodejs-library/lib", "HostMessageMode")
  @js.native
  object HostMessageMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ts3NodejsLibrary.libTypesEnumMod.HostMessageMode & Double] = js.native
    
    /* 1 */ val LOG: typingsJapgolly.ts3NodejsLibrary.libTypesEnumMod.HostMessageMode.LOG & Double = js.native
    
    /* 2 */ val MODAL: typingsJapgolly.ts3NodejsLibrary.libTypesEnumMod.HostMessageMode.MODAL & Double = js.native
    
    /* 3 */ val MODALQUIT: typingsJapgolly.ts3NodejsLibrary.libTypesEnumMod.HostMessageMode.MODALQUIT & Double = js.native
    
    /* 0 */ val NONE: typingsJapgolly.ts3NodejsLibrary.libTypesEnumMod.HostMessageMode.NONE & Double = js.native
  }
  
  @JSImport("ts3-nodejs-library/lib", "LogLevel")
  @js.native
  object LogLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ts3NodejsLibrary.libTypesEnumMod.LogLevel & Double] = js.native
    
    /* 3 */ val DEBUG: typingsJapgolly.ts3NodejsLibrary.libTypesEnumMod.LogLevel.DEBUG & Double = js.native
    
    /* 1 */ val ERROR: typingsJapgolly.ts3NodejsLibrary.libTypesEnumMod.LogLevel.ERROR & Double = js.native
    
    /* 4 */ val INFO: typingsJapgolly.ts3NodejsLibrary.libTypesEnumMod.LogLevel.INFO & Double = js.native
    
    /* 2 */ val WARNING: typingsJapgolly.ts3NodejsLibrary.libTypesEnumMod.LogLevel.WARNING & Double = js.native
  }
  
  @JSImport("ts3-nodejs-library/lib", "PermissionGroupDatabaseTypes")
  @js.native
  object PermissionGroupDatabaseTypes extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.ts3NodejsLibrary.libTypesEnumMod.PermissionGroupDatabaseTypes & Double
      ] = js.native
    
    /* 2 */ val Query: typingsJapgolly.ts3NodejsLibrary.libTypesEnumMod.PermissionGroupDatabaseTypes.Query & Double = js.native
    
    /* 1 */ val Regular: typingsJapgolly.ts3NodejsLibrary.libTypesEnumMod.PermissionGroupDatabaseTypes.Regular & Double = js.native
    
    /* 0 */ val Template: typingsJapgolly.ts3NodejsLibrary.libTypesEnumMod.PermissionGroupDatabaseTypes.Template & Double = js.native
  }
  
  @JSImport("ts3-nodejs-library/lib", "PermissionGroupTypes")
  @js.native
  object PermissionGroupTypes extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ts3NodejsLibrary.libTypesEnumMod.PermissionGroupTypes & Double] = js.native
    
    /* 2 */ val Channel: typingsJapgolly.ts3NodejsLibrary.libTypesEnumMod.PermissionGroupTypes.Channel & Double = js.native
    
    /* 4 */ val ChannelClient: typingsJapgolly.ts3NodejsLibrary.libTypesEnumMod.PermissionGroupTypes.ChannelClient & Double = js.native
    
    /* 3 */ val ChannelGroup: typingsJapgolly.ts3NodejsLibrary.libTypesEnumMod.PermissionGroupTypes.ChannelGroup & Double = js.native
    
    /* 1 */ val GlobalClient: typingsJapgolly.ts3NodejsLibrary.libTypesEnumMod.PermissionGroupTypes.GlobalClient & Double = js.native
    
    /* 0 */ val ServerGroup: typingsJapgolly.ts3NodejsLibrary.libTypesEnumMod.PermissionGroupTypes.ServerGroup & Double = js.native
  }
  
  @JSImport("ts3-nodejs-library/lib", "QueryProtocol")
  @js.native
  val QueryProtocol: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TeamSpeak.QueryProtocol */ Any = js.native
  
  @JSImport("ts3-nodejs-library/lib", "ReasonIdentifier")
  @js.native
  object ReasonIdentifier extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ts3NodejsLibrary.libTypesEnumMod.ReasonIdentifier & Double] = js.native
    
    /* 4 */ val KICK_CHANNEL: typingsJapgolly.ts3NodejsLibrary.libTypesEnumMod.ReasonIdentifier.KICK_CHANNEL & Double = js.native
    
    /* 5 */ val KICK_SERVER: typingsJapgolly.ts3NodejsLibrary.libTypesEnumMod.ReasonIdentifier.KICK_SERVER & Double = js.native
  }
  
  @JSImport("ts3-nodejs-library/lib", "ResponseError")
  @js.native
  open class ResponseError protected ()
    extends typingsJapgolly.ts3NodejsLibrary.libExceptionResponseErrorMod.ResponseError {
    def this(error: QueryErrorMessage, stack: String) = this()
  }
  
  @JSImport("ts3-nodejs-library/lib", "TeamSpeak")
  @js.native
  open class TeamSpeak protected ()
    extends typingsJapgolly.ts3NodejsLibrary.libTeamSpeakMod.TeamSpeak {
    def this(config: PartialConnectionParams) = this()
  }
  /* static members */
  object TeamSpeak {
    
    @JSImport("ts3-nodejs-library/lib", "TeamSpeak")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ts3-nodejs-library/lib", "TeamSpeak.QueryProtocol")
    @js.native
    object QueryProtocol extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[
            typingsJapgolly.ts3NodejsLibrary.libTeamSpeakMod.TeamSpeak.QueryProtocol & String
          ] = js.native
      
      /* "raw" */ val RAW: typingsJapgolly.ts3NodejsLibrary.libTeamSpeakMod.TeamSpeak.QueryProtocol.RAW & String = js.native
      
      /* "ssh" */ val SSH: typingsJapgolly.ts3NodejsLibrary.libTeamSpeakMod.TeamSpeak.QueryProtocol.SSH & String = js.native
    }
    
    /**
      * connects via a Promise wrapper
      * @param config config options to connect
      */
    inline def connect(config: PartialConnectionParams): js.Promise[typingsJapgolly.ts3NodejsLibrary.libTeamSpeakMod.TeamSpeak] = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.ts3NodejsLibrary.libTeamSpeakMod.TeamSpeak]]
    
    /**
      * filters an array with given filter
      * @param array the array which should get filtered
      * @param filter filter object
      */
    inline def filter[T /* <: ResponseEntry */](array: js.Array[T], filter: Partial[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(array.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
    
    /**
      * retrieves the first element of an array
      * @param input the response input
      */
    inline def singleResponse[T](input: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("singleResponse")(input.asInstanceOf[js.Any]).asInstanceOf[T]
    inline def singleResponse[T](input: js.Array[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("singleResponse")(input.asInstanceOf[js.Any]).asInstanceOf[T]
    
    /**
      * Transforms an Input to an Array
      * @param input input data which should be converted to an array
      */
    inline def toArray[T](input: T): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(input.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
    inline def toArray[T](input: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(input.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
    
    /**
      * waits a set time of ms
      * @param time time in ms to wait
      */
    inline def wait(time: Double): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("wait")(time.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  }
  
  @JSImport("ts3-nodejs-library/lib", "TeamSpeakChannel")
  @js.native
  open class TeamSpeakChannel protected ()
    extends typingsJapgolly.ts3NodejsLibrary.libNodeChannelMod.TeamSpeakChannel {
    def this(parent: typingsJapgolly.ts3NodejsLibrary.libTeamSpeakMod.TeamSpeak, list: ChannelEntry) = this()
  }
  /* static members */
  object TeamSpeakChannel {
    
    @JSImport("ts3-nodejs-library/lib", "TeamSpeakChannel")
    @js.native
    val ^ : js.Any = js.native
    
    /** retrieves the client id from a string or teamspeak client */
    inline def getId[T /* <: ChannelType */](): /* import warning: importer.ImportType#apply Failed type conversion: T extends undefined ? undefined : string */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getId")().asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T extends undefined ? undefined : string */ js.Any]
    inline def getId[T /* <: ChannelType */](channel: T): /* import warning: importer.ImportType#apply Failed type conversion: T extends undefined ? undefined : string */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getId")(channel.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T extends undefined ? undefined : string */ js.Any]
    
    /** retrieves the clients from an array */
    inline def getMultipleIds(channels: MultiChannelType): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMultipleIds")(channels.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  }
  
  @JSImport("ts3-nodejs-library/lib", "TeamSpeakChannelGroup")
  @js.native
  open class TeamSpeakChannelGroup protected ()
    extends typingsJapgolly.ts3NodejsLibrary.libNodeChannelGroupMod.TeamSpeakChannelGroup {
    def this(parent: typingsJapgolly.ts3NodejsLibrary.libTeamSpeakMod.TeamSpeak, list: ChannelGroupEntry) = this()
  }
  /* static members */
  object TeamSpeakChannelGroup {
    
    @JSImport("ts3-nodejs-library/lib", "TeamSpeakChannelGroup")
    @js.native
    val ^ : js.Any = js.native
    
    /** retrieves the client id from a string or teamspeak client */
    inline def getId[T /* <: GroupType */](): /* import warning: importer.ImportType#apply Failed type conversion: T extends undefined ? undefined : string */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getId")().asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T extends undefined ? undefined : string */ js.Any]
    inline def getId[T /* <: GroupType */](channel: T): /* import warning: importer.ImportType#apply Failed type conversion: T extends undefined ? undefined : string */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getId")(channel.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T extends undefined ? undefined : string */ js.Any]
    
    /** retrieves the clients from an array */
    inline def getMultipleIds(client: MultiGroupType): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMultipleIds")(client.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  }
  
  @JSImport("ts3-nodejs-library/lib", "TeamSpeakClient")
  @js.native
  open class TeamSpeakClient protected ()
    extends typingsJapgolly.ts3NodejsLibrary.libNodeClientMod.TeamSpeakClient {
    def this(parent: typingsJapgolly.ts3NodejsLibrary.libTeamSpeakMod.TeamSpeak, list: ClientEntry) = this()
  }
  /* static members */
  object TeamSpeakClient {
    
    @JSImport("ts3-nodejs-library/lib", "TeamSpeakClient")
    @js.native
    val ^ : js.Any = js.native
    
    /** retrieves the client dbid from a string or teamspeak client */
    inline def getDbid[T /* <: ClientType */](): /* import warning: importer.ImportType#apply Failed type conversion: T extends undefined ? undefined : string */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getDbid")().asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T extends undefined ? undefined : string */ js.Any]
    inline def getDbid[T /* <: ClientType */](client: T): /* import warning: importer.ImportType#apply Failed type conversion: T extends undefined ? undefined : string */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getDbid")(client.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T extends undefined ? undefined : string */ js.Any]
    
    /** retrieves the client id from a string or teamspeak client */
    inline def getId[T /* <: ClientType */](): /* import warning: importer.ImportType#apply Failed type conversion: T extends undefined ? undefined : string */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getId")().asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T extends undefined ? undefined : string */ js.Any]
    inline def getId[T /* <: ClientType */](client: T): /* import warning: importer.ImportType#apply Failed type conversion: T extends undefined ? undefined : string */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getId")(client.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T extends undefined ? undefined : string */ js.Any]
    
    /** retrieves the clients from an array */
    inline def getMultipleDbids(client: MultiClientType): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMultipleDbids")(client.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    
    /** retrieves the clients from an array */
    inline def getMultipleIds(client: MultiClientType): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMultipleIds")(client.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    
    /** retrieves the clients from an array */
    inline def getMultipleUids(client: MultiClientType): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMultipleUids")(client.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    
    /** retrieves the client dbid from a string or teamspeak client */
    inline def getUid[T /* <: ClientType */](): /* import warning: importer.ImportType#apply Failed type conversion: T extends undefined ? undefined : string */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getUid")().asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T extends undefined ? undefined : string */ js.Any]
    inline def getUid[T /* <: ClientType */](client: T): /* import warning: importer.ImportType#apply Failed type conversion: T extends undefined ? undefined : string */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getUid")(client.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T extends undefined ? undefined : string */ js.Any]
  }
  
  @JSImport("ts3-nodejs-library/lib", "TeamSpeakServer")
  @js.native
  open class TeamSpeakServer protected ()
    extends typingsJapgolly.ts3NodejsLibrary.libNodeServerMod.TeamSpeakServer {
    def this(parent: typingsJapgolly.ts3NodejsLibrary.libTeamSpeakMod.TeamSpeak, list: ServerEntry) = this()
  }
  /* static members */
  object TeamSpeakServer {
    
    @JSImport("ts3-nodejs-library/lib", "TeamSpeakServer")
    @js.native
    val ^ : js.Any = js.native
    
    /** retrieves the client id from a string or teamspeak client */
    inline def getId[T /* <: ServerType */](): /* import warning: importer.ImportType#apply Failed type conversion: T extends undefined ? undefined : string */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getId")().asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T extends undefined ? undefined : string */ js.Any]
    inline def getId[T /* <: ServerType */](server: T): /* import warning: importer.ImportType#apply Failed type conversion: T extends undefined ? undefined : string */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getId")(server.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T extends undefined ? undefined : string */ js.Any]
    
    /** retrieves the clients from an array */
    inline def getMultipleIds(servers: MultiServerType): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMultipleIds")(servers.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  }
  
  @JSImport("ts3-nodejs-library/lib", "TeamSpeakServerGroup")
  @js.native
  open class TeamSpeakServerGroup protected ()
    extends typingsJapgolly.ts3NodejsLibrary.libNodeServerGroupMod.TeamSpeakServerGroup {
    def this(parent: typingsJapgolly.ts3NodejsLibrary.libTeamSpeakMod.TeamSpeak, list: ServerGroupEntry) = this()
  }
  /* static members */
  object TeamSpeakServerGroup {
    
    @JSImport("ts3-nodejs-library/lib", "TeamSpeakServerGroup")
    @js.native
    val ^ : js.Any = js.native
    
    /** retrieves the client id from a string or teamspeak client */
    inline def getId[T /* <: typingsJapgolly.ts3NodejsLibrary.libNodeServerGroupMod.TeamSpeakServerGroup.GroupType */](): /* import warning: importer.ImportType#apply Failed type conversion: T extends undefined ? undefined : string */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getId")().asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T extends undefined ? undefined : string */ js.Any]
    inline def getId[T /* <: typingsJapgolly.ts3NodejsLibrary.libNodeServerGroupMod.TeamSpeakServerGroup.GroupType */](group: T): /* import warning: importer.ImportType#apply Failed type conversion: T extends undefined ? undefined : string */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getId")(group.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T extends undefined ? undefined : string */ js.Any]
    
    /** retrieves the clients from an array */
    inline def getMultipleIds(groups: typingsJapgolly.ts3NodejsLibrary.libNodeServerGroupMod.TeamSpeakServerGroup.MultiGroupType): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMultipleIds")(groups.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  }
  
  @JSImport("ts3-nodejs-library/lib", "TextMessageTargetMode")
  @js.native
  object TextMessageTargetMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ts3NodejsLibrary.libTypesEnumMod.TextMessageTargetMode & Double] = js.native
    
    /* 2 */ val CHANNEL: typingsJapgolly.ts3NodejsLibrary.libTypesEnumMod.TextMessageTargetMode.CHANNEL & Double = js.native
    
    /* 1 */ val CLIENT: typingsJapgolly.ts3NodejsLibrary.libTypesEnumMod.TextMessageTargetMode.CLIENT & Double = js.native
    
    /* 3 */ val SERVER: typingsJapgolly.ts3NodejsLibrary.libTypesEnumMod.TextMessageTargetMode.SERVER & Double = js.native
  }
  
  @JSImport("ts3-nodejs-library/lib", "TokenType")
  @js.native
  object TokenType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ts3NodejsLibrary.libTypesEnumMod.TokenType & Double] = js.native
    
    /* 1 */ val ChannelGroup: typingsJapgolly.ts3NodejsLibrary.libTypesEnumMod.TokenType.ChannelGroup & Double = js.native
    
    /* 0 */ val ServerGroup: typingsJapgolly.ts3NodejsLibrary.libTypesEnumMod.TokenType.ServerGroup & Double = js.native
  }
}
