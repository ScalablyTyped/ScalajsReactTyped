package typingsJapgolly.samchon

import org.scalajs.dom.MessagePort
import typingsJapgolly.samchon.protocolEntityIentityMod.IEntity
import typingsJapgolly.samchon.protocolInvokeIprotocolMod.IProtocol
import typingsJapgolly.samchon.protocolServerIserverMod.IServer
import typingsJapgolly.sxml.mod.XML
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object protocolMod {
  
  @JSImport("samchon/protocol", "ClientDriver")
  @js.native
  open class ClientDriver protected ()
    extends typingsJapgolly.samchon.protocolCommunicatorClientDriverClientDriverMod.ClientDriver {
    /**
      * Construct from a socket.
      */
    def this(socket: Any) = this()
  }
  
  @JSImport("samchon/protocol", "DedicatedWorkerClientDriver")
  @js.native
  /**
    * Default Constructor.
    */
  open class DedicatedWorkerClientDriver ()
    extends typingsJapgolly.samchon.protocolCommunicatorClientDriverDedicatedWorkerClientDriverMod.DedicatedWorkerClientDriver
  
  /* note: abstract class */ @JSImport("samchon/protocol", "DedicatedWorkerServer")
  @js.native
  open class DedicatedWorkerServer ()
    extends typingsJapgolly.samchon.protocolServerDedicatedWorkerServerMod.DedicatedWorkerServer
  
  @JSImport("samchon/protocol", "DedicatedWorkerServerBase")
  @js.native
  open class DedicatedWorkerServerBase protected ()
    extends typingsJapgolly.samchon.protocolServerBaseDedicatedWorkerServerBaseMod.DedicatedWorkerServerBase {
    /**
      * Construct from a *hooker*.
      *
      * @param hooker A hooker throwing responsibility of server's role.
      */
    def this(hooker: IServer) = this()
  }
  
  @JSImport("samchon/protocol", "DedicatedWorkerServerConnector")
  @js.native
  open class DedicatedWorkerServerConnector protected ()
    extends typingsJapgolly.samchon.protocolCommunicatorServerConnectorDedicatedWorkerServerConnectorMod.DedicatedWorkerServerConnector {
    /**
      * Construct from *listener*.
      *
      * @param listener A listener object to listen replied message from newly connected client in
      *				   {@link IProtocol.replyData replyData()} as an {@link Invoke} object.
      */
    def this(listener: IProtocol) = this()
  }
  
  /* note: abstract class */ @JSImport("samchon/protocol", "Entity")
  @js.native
  /**
    * Default Constructor.
    */
  open class Entity ()
    extends typingsJapgolly.samchon.protocolEntityEntityMod.Entity
  
  /* note: abstract class */ @JSImport("samchon/protocol", "EntityArray")
  @js.native
  open class EntityArray[T /* <: IEntity */] ()
    extends typingsJapgolly.samchon.protocolEntityEntityArrayMod.EntityArray[T]
  
  /* note: abstract class */ @JSImport("samchon/protocol", "EntityArrayCollection")
  @js.native
  open class EntityArrayCollection[T /* <: IEntity */] ()
    extends typingsJapgolly.samchon.protocolEntityEntityCollectionMod.EntityArrayCollection[T]
  
  /* note: abstract class */ @JSImport("samchon/protocol", "EntityDeque")
  @js.native
  open class EntityDeque[T /* <: IEntity */] ()
    extends typingsJapgolly.samchon.protocolEntityEntityArrayMod.EntityDeque[T]
  
  /* note: abstract class */ @JSImport("samchon/protocol", "EntityDequeCollection")
  @js.native
  open class EntityDequeCollection[T /* <: IEntity */] ()
    extends typingsJapgolly.samchon.protocolEntityEntityCollectionMod.EntityDequeCollection[T]
  
  /* note: abstract class */ @JSImport("samchon/protocol", "EntityList")
  @js.native
  open class EntityList[T /* <: IEntity */] ()
    extends typingsJapgolly.samchon.protocolEntityEntityArrayMod.EntityList[T]
  
  /* note: abstract class */ @JSImport("samchon/protocol", "EntityListCollection")
  @js.native
  open class EntityListCollection[T /* <: IEntity */] ()
    extends typingsJapgolly.samchon.protocolEntityEntityCollectionMod.EntityListCollection[T]
  
  object IEntity {
    
    @JSImport("samchon/protocol", "IEntity")
    @js.native
    val ^ : js.Any = js.native
    
    inline def construct(
      entity: typingsJapgolly.samchon.protocolEntityIentityMod.IEntity,
      xml: XML,
      prohibited_names: String*
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("construct")((scala.List(entity.asInstanceOf[js.Any], xml.asInstanceOf[js.Any])).`++`(prohibited_names.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Unit]
    
    inline def toXML(entity: typingsJapgolly.samchon.protocolEntityIentityMod.IEntity, prohibited_names: String*): XML = ^.asInstanceOf[js.Dynamic].applyDynamic("toXML")(scala.List(entity.asInstanceOf[js.Any]).`++`(prohibited_names.asInstanceOf[Seq[js.Any]])*).asInstanceOf[XML]
  }
  
  object IEntityGroup {
    
    @JSImport("samchon/protocol", "IEntityGroup")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @hidden
      */
    inline def construct[T /* <: IEntity */, SourceT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.Container<T, SourceT, IteratorT, ReverseT> */ Any */, IteratorT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.Iterator<T, SourceT, IteratorT, ReverseT> */ Any */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ Any */](
      entityGroup: typingsJapgolly.samchon.protocolEntityIentitygroupMod.IEntityGroup[T, SourceT, IteratorT, ReverseT],
      xml: XML,
      prohibited_names: String*
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("construct")((scala.List(entityGroup.asInstanceOf[js.Any], xml.asInstanceOf[js.Any])).`++`(prohibited_names.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Unit]
    
    inline def count[T /* <: IEntity */, SourceT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.Container<T, SourceT, IteratorT, ReverseT> */ Any */, IteratorT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.Iterator<T, SourceT, IteratorT, ReverseT> */ Any */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ Any */](
      entityGroup: typingsJapgolly.samchon.protocolEntityIentitygroupMod.IEntityGroup[T, SourceT, IteratorT, ReverseT],
      key: Any
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("count")(entityGroup.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def get[T /* <: IEntity */, SourceT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.Container<T, SourceT, IteratorT, ReverseT> */ Any */, IteratorT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.Iterator<T, SourceT, IteratorT, ReverseT> */ Any */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ Any */](
      entityGroup: typingsJapgolly.samchon.protocolEntityIentitygroupMod.IEntityGroup[T, SourceT, IteratorT, ReverseT],
      key: Any
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(entityGroup.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[T]
    
    inline def has[T /* <: IEntity */, SourceT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.Container<T, SourceT, IteratorT, ReverseT> */ Any */, IteratorT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.Iterator<T, SourceT, IteratorT, ReverseT> */ Any */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ Any */](
      entityGroup: typingsJapgolly.samchon.protocolEntityIentitygroupMod.IEntityGroup[T, SourceT, IteratorT, ReverseT],
      key: Any
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("has")(entityGroup.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * @hidden
      */
    inline def toXML[T /* <: IEntity */, SourceT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.Container<T, SourceT, IteratorT, ReverseT> */ Any */, IteratorT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.Iterator<T, SourceT, IteratorT, ReverseT> */ Any */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ Any */](
      group: typingsJapgolly.samchon.protocolEntityIentitygroupMod.IEntityGroup[T, SourceT, IteratorT, ReverseT],
      prohibited_names: String*
    ): XML = ^.asInstanceOf[js.Dynamic].applyDynamic("toXML")(scala.List(group.asInstanceOf[js.Any]).`++`(prohibited_names.asInstanceOf[Seq[js.Any]])*).asInstanceOf[XML]
  }
  
  @JSImport("samchon/protocol", "Invoke")
  @js.native
  /**
    * Default Constructor.
    */
  open class Invoke ()
    extends typingsJapgolly.samchon.protocolInvokeInvokeMod.Invoke {
    /**
      * Copy Constructor.
      *
      * @param invoke
      */
    def this(invoke: typingsJapgolly.samchon.protocolInvokeInvokeMod.Invoke) = this()
    def this(listener: String) = this()
    /**
      * Construct from listener and parametric values.
      *
      * @param listener
      * @param parameters
      */
    def this(listener: String, parameters: (Boolean | Double | String | XML | js.typedarray.Uint8Array)*) = this()
  }
  
  @JSImport("samchon/protocol", "InvokeParameter")
  @js.native
  /**
    * Default Constructor.
    */
  open class InvokeParameter ()
    extends typingsJapgolly.samchon.protocolInvokeInvokeParameterMod.InvokeParameter {
    def this(`val`: String) = this()
    def this(`val`: js.typedarray.Uint8Array) = this()
    def this(`val`: Boolean) = this()
    def this(`val`: Double) = this()
    def this(`val`: XML) = this()
    def this(name: String, `val`: String) = this()
    def this(name: String, `val`: js.typedarray.Uint8Array) = this()
    /**
      * Construct from variable name and number value.
      *
      * @param name
      * @param val
      */
    def this(name: String, `val`: Boolean) = this()
    def this(name: String, `val`: Double) = this()
    def this(name: String, `val`: XML) = this()
  }
  
  /* note: abstract class */ @JSImport("samchon/protocol", "Server")
  @js.native
  open class Server ()
    extends typingsJapgolly.samchon.protocolServerServerMod.Server
  
  @JSImport("samchon/protocol", "ServerBase")
  @js.native
  open class ServerBase protected ()
    extends typingsJapgolly.samchon.protocolServerBaseServerBaseMod.ServerBase {
    /**
      * Construct from a *hooker*.
      *
      * @param hooker A hooker throwing responsibility of server's role.
      */
    def this(hooker: IServer) = this()
  }
  
  @JSImport("samchon/protocol", "ServerConnector")
  @js.native
  open class ServerConnector protected ()
    extends typingsJapgolly.samchon.protocolCommunicatorServerConnectorServerConnectorMod.ServerConnector {
    /**
      * Construct from *listener*.
      *
      * @param listener A listener object to listen replied message from newly connected client in
      *				   {@link IProtocol.replyData replyData()} as an {@link Invoke} object.
      */
    def this(listener: IProtocol) = this()
  }
  
  @JSImport("samchon/protocol", "SharedWorkerClientDriver")
  @js.native
  open class SharedWorkerClientDriver protected ()
    extends typingsJapgolly.samchon.protocolCommunicatorClientDriverSharedWorkerClientDriverMod.SharedWorkerClientDriver {
    /**
      * Construct from a MessagePort object.
      */
    def this(port: MessagePort) = this()
  }
  
  /* note: abstract class */ @JSImport("samchon/protocol", "SharedWorkerServer")
  @js.native
  open class SharedWorkerServer ()
    extends typingsJapgolly.samchon.protocolServerSharedWorkerServerMod.SharedWorkerServer
  
  @JSImport("samchon/protocol", "SharedWorkerServerBase")
  @js.native
  open class SharedWorkerServerBase protected ()
    extends typingsJapgolly.samchon.protocolServerBaseSharedWorkerServerBaseMod.SharedWorkerServerBase {
    /**
      * Construct from a *hooker*.
      *
      * @param hooker A hooker throwing responsibility of server's role.
      */
    def this(hooker: IServer) = this()
  }
  
  @JSImport("samchon/protocol", "SharedWorkerServerConnector")
  @js.native
  open class SharedWorkerServerConnector protected ()
    extends typingsJapgolly.samchon.protocolCommunicatorServerConnectorSharedWorkerServerConnectorMod.SharedWorkerServerConnector {
    /**
      * Construct from *listener*.
      *
      * @param listener A listener object to listen replied message from newly connected client in
      *				   {@link IProtocol.replyData replyData()} as an {@link Invoke} object.
      */
    def this(listener: IProtocol) = this()
  }
  
  @JSImport("samchon/protocol", "WebClientDriver")
  @js.native
  open class WebClientDriver protected ()
    extends typingsJapgolly.samchon.protocolCommunicatorClientDriverWebClientDriverMod.WebClientDriver {
    /**
      * Initialization Constructor.
      *
      * @param connection Connection driver, a socket for web-socket.
      * @param path Requested path.
      * @param session_id Session ID, an identifier of the remote client.
      */
    def this(connection: Any, path: String, session_id: String) = this()
  }
  
  /* note: abstract class */ @JSImport("samchon/protocol", "WebServer")
  @js.native
  /**
    * Default Constructor.
    */
  open class WebServer ()
    extends typingsJapgolly.samchon.protocolServerWebServerMod.WebServer
  
  @JSImport("samchon/protocol", "WebServerBase")
  @js.native
  open class WebServerBase protected ()
    extends typingsJapgolly.samchon.protocolServerBaseWebServerBaseMod.WebServerBase {
    /**
      * Construct from a *hooker*.
      *
      * @param hooker A hooker throwing responsibility of server's role.
      */
    def this(hooker: IServer) = this()
  }
  
  @JSImport("samchon/protocol", "WebServerConnector")
  @js.native
  open class WebServerConnector protected ()
    extends typingsJapgolly.samchon.protocolCommunicatorServerConnectorWebServerConnectorMod.WebServerConnector {
    /**
      * Construct from *listener*.
      *
      * @param listener A listener object to listen replied message from newly connected client in
      *				   {@link IProtocol.replyData replyData()} as an {@link Invoke} object.
      */
    def this(listener: IProtocol) = this()
  }
}
