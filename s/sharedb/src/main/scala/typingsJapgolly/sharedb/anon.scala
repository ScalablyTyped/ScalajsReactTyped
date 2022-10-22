package typingsJapgolly.sharedb

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.sharedb.libClientMod.Doc
import typingsJapgolly.sharedb.libSharedbMod.Query
import typingsJapgolly.sharedb.mod.ErrorHandler
import typingsJapgolly.sharedb.mod.ErrorHandlerContext
import typingsJapgolly.sharedb.mod.ExtraDB
import typingsJapgolly.sharedb.mod.MilestoneDB
import typingsJapgolly.sharedb.mod.PubSub
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0`[T] extends StObject {
    
    var results: js.UndefOr[js.Array[Doc[T]]] = js.undefined
  }
  object `0` {
    
    inline def apply[T](): `0`[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`0`[T]]
    }
    
    extension [Self <: `0`[?], T](x: Self & `0`[T]) {
      
      inline def setResults(value: js.Array[Doc[T]]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
      
      inline def setResultsVarargs(value: Doc[T]*): Self = StObject.set(x, "results", js.Array(value*))
    }
  }
  
  trait Data extends StObject {
    
    var data: Any
    
    var `type`: String
  }
  object Data {
    
    inline def apply(data: Any, `type`: String): Data = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    extension [Self <: Data](x: Self) {
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Db extends StObject {
    
    var db: js.UndefOr[Any] = js.undefined
    
    /**
      * @deprecated disableDocAction was removed in v1.0
      */
    var disableDocAction: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @deprecated disableSpaceDelimitedActions was removed in v1.0
      */
    var disableSpaceDelimitedActions: js.UndefOr[Boolean] = js.undefined
    
    var doNotForwardSendPresenceErrorsToClient: js.UndefOr[Boolean] = js.undefined
    
    var errorHandler: js.UndefOr[ErrorHandler] = js.undefined
    
    var extraDbs: js.UndefOr[StringDictionary[ExtraDB]] = js.undefined
    
    var maxSubmitRetries: js.UndefOr[Double] = js.undefined
    
    var milestoneDb: js.UndefOr[MilestoneDB] = js.undefined
    
    var presence: js.UndefOr[Boolean] = js.undefined
    
    var pubsub: js.UndefOr[PubSub] = js.undefined
    
    var suppressPublish: js.UndefOr[Boolean] = js.undefined
  }
  object Db {
    
    inline def apply(): Db = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Db]
    }
    
    extension [Self <: Db](x: Self) {
      
      inline def setDb(value: Any): Self = StObject.set(x, "db", value.asInstanceOf[js.Any])
      
      inline def setDbUndefined: Self = StObject.set(x, "db", js.undefined)
      
      inline def setDisableDocAction(value: Boolean): Self = StObject.set(x, "disableDocAction", value.asInstanceOf[js.Any])
      
      inline def setDisableDocActionUndefined: Self = StObject.set(x, "disableDocAction", js.undefined)
      
      inline def setDisableSpaceDelimitedActions(value: Boolean): Self = StObject.set(x, "disableSpaceDelimitedActions", value.asInstanceOf[js.Any])
      
      inline def setDisableSpaceDelimitedActionsUndefined: Self = StObject.set(x, "disableSpaceDelimitedActions", js.undefined)
      
      inline def setDoNotForwardSendPresenceErrorsToClient(value: Boolean): Self = StObject.set(x, "doNotForwardSendPresenceErrorsToClient", value.asInstanceOf[js.Any])
      
      inline def setDoNotForwardSendPresenceErrorsToClientUndefined: Self = StObject.set(x, "doNotForwardSendPresenceErrorsToClient", js.undefined)
      
      inline def setErrorHandler(value: (/* error */ js.Error, /* context */ ErrorHandlerContext) => Callback): Self = StObject.set(x, "errorHandler", js.Any.fromFunction2((t0: /* error */ js.Error, t1: /* context */ ErrorHandlerContext) => (value(t0, t1)).runNow()))
      
      inline def setErrorHandlerUndefined: Self = StObject.set(x, "errorHandler", js.undefined)
      
      inline def setExtraDbs(value: StringDictionary[ExtraDB]): Self = StObject.set(x, "extraDbs", value.asInstanceOf[js.Any])
      
      inline def setExtraDbsUndefined: Self = StObject.set(x, "extraDbs", js.undefined)
      
      inline def setMaxSubmitRetries(value: Double): Self = StObject.set(x, "maxSubmitRetries", value.asInstanceOf[js.Any])
      
      inline def setMaxSubmitRetriesUndefined: Self = StObject.set(x, "maxSubmitRetries", js.undefined)
      
      inline def setMilestoneDb(value: MilestoneDB): Self = StObject.set(x, "milestoneDb", value.asInstanceOf[js.Any])
      
      inline def setMilestoneDbUndefined: Self = StObject.set(x, "milestoneDb", js.undefined)
      
      inline def setPresence(value: Boolean): Self = StObject.set(x, "presence", value.asInstanceOf[js.Any])
      
      inline def setPresenceUndefined: Self = StObject.set(x, "presence", js.undefined)
      
      inline def setPubsub(value: PubSub): Self = StObject.set(x, "pubsub", value.asInstanceOf[js.Any])
      
      inline def setPubsubUndefined: Self = StObject.set(x, "pubsub", js.undefined)
      
      inline def setSuppressPublish(value: Boolean): Self = StObject.set(x, "suppressPublish", value.asInstanceOf[js.Any])
      
      inline def setSuppressPublishUndefined: Self = StObject.set(x, "suppressPublish", js.undefined)
    }
  }
  
  trait IsServer extends StObject {
    
    /**
      * `true` if this is agent is handling a ShareDB client in the same
      * Node process.
      */
    var isServer: js.UndefOr[Boolean] = js.undefined
  }
  object IsServer {
    
    inline def apply(): IsServer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IsServer]
    }
    
    extension [Self <: IsServer](x: Self) {
      
      inline def setIsServer(value: Boolean): Self = StObject.set(x, "isServer", value.asInstanceOf[js.Any])
      
      inline def setIsServerUndefined: Self = StObject.set(x, "isServer", js.undefined)
    }
  }
  
  trait Metadata extends StObject {
    
    var metadata: js.UndefOr[Boolean] = js.undefined
  }
  object Metadata {
    
    inline def apply(): Metadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Metadata]
    }
    
    extension [Self <: Metadata](x: Self) {
      
      inline def setMetadata(value: Boolean): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    }
  }
  
  trait Results extends StObject {
    
    var results: js.UndefOr[js.Array[Query[Any]]] = js.undefined
  }
  object Results {
    
    inline def apply(): Results = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Results]
    }
    
    extension [Self <: Results](x: Self) {
      
      inline def setResults(value: js.Array[Query[Any]]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
      
      inline def setResultsVarargs(value: Query[Any]*): Self = StObject.set(x, "results", js.Array(value*))
    }
  }
  
  trait Source extends StObject {
    
    var source: js.UndefOr[Any] = js.undefined
  }
  object Source {
    
    inline def apply(): Source = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Source]
    }
    
    extension [Self <: Source](x: Self) {
      
      inline def setSource(value: Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    }
  }
}
