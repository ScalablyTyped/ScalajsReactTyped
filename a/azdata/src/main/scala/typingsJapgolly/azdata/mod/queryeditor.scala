package typingsJapgolly.azdata.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.azdata.anon.Content
import typingsJapgolly.azdata.mod.connection.ConnectionProfile
import typingsJapgolly.azdata.mod.window.DialogTab
import typingsJapgolly.std.Map
import typingsJapgolly.vscode.Thenable
import typingsJapgolly.vscode.mod.Disposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object queryeditor {
  
  @JSImport("azdata", "queryeditor")
  @js.native
  val ^ : js.Any = js.native
  
  inline def connect(fileUri: String, connectionId: String): Thenable[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(fileUri.asInstanceOf[js.Any], connectionId.asInstanceOf[js.Any])).asInstanceOf[Thenable[Unit]]
  
  inline def getQueryDocument(fileUri: String): Thenable[QueryDocument] = ^.asInstanceOf[js.Dynamic].applyDynamic("getQueryDocument")(fileUri.asInstanceOf[js.Any]).asInstanceOf[Thenable[QueryDocument]]
  
  inline def openQueryDocument(): Thenable[QueryDocument] = ^.asInstanceOf[js.Dynamic].applyDynamic("openQueryDocument")().asInstanceOf[Thenable[QueryDocument]]
  inline def openQueryDocument(options: Unit, providerId: String): Thenable[QueryDocument] = (^.asInstanceOf[js.Dynamic].applyDynamic("openQueryDocument")(options.asInstanceOf[js.Any], providerId.asInstanceOf[js.Any])).asInstanceOf[Thenable[QueryDocument]]
  inline def openQueryDocument(options: Content): Thenable[QueryDocument] = ^.asInstanceOf[js.Dynamic].applyDynamic("openQueryDocument")(options.asInstanceOf[js.Any]).asInstanceOf[Thenable[QueryDocument]]
  inline def openQueryDocument(options: Content, providerId: String): Thenable[QueryDocument] = (^.asInstanceOf[js.Dynamic].applyDynamic("openQueryDocument")(options.asInstanceOf[js.Any], providerId.asInstanceOf[js.Any])).asInstanceOf[Thenable[QueryDocument]]
  
  inline def registerQueryEventListener(listener: QueryEventListener): Disposable = ^.asInstanceOf[js.Dynamic].applyDynamic("registerQueryEventListener")(listener.asInstanceOf[js.Any]).asInstanceOf[Disposable]
  
  inline def runQuery(fileUri: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("runQuery")(fileUri.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def runQuery(fileUri: String, options: Unit, runCurrentQuery: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("runQuery")(fileUri.asInstanceOf[js.Any], options.asInstanceOf[js.Any], runCurrentQuery.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def runQuery(fileUri: String, options: Map[String, String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("runQuery")(fileUri.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def runQuery(fileUri: String, options: Map[String, String], runCurrentQuery: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("runQuery")(fileUri.asInstanceOf[js.Any], options.asInstanceOf[js.Any], runCurrentQuery.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait QueryDocument extends StObject {
    
    /**
      * Connect the query document using the given connection profile
      * @param connectionProfile The profile to use as the connection
      */
    def connect(connectionProfile: ConnectionProfile): Thenable[Unit]
    
    /**
      * Adds a custom tab to the query editor results view
      * @param tab The tab to add
      */
    def createQueryTab(tab: DialogTab): Unit
    
    /**
      * The ID of the connection provider for this query document
      */
    var providerId: String
    
    /**
      * Set the document's execution options, which will be used whenever a query is executed.
      * @param options The execution options
      */
    def setExecutionOptions(options: Map[String, Any]): Thenable[Unit]
    
    /**
      * The URI identifying this document
      */
    var uri: String
  }
  object QueryDocument {
    
    inline def apply(
      connect: ConnectionProfile => Thenable[Unit],
      createQueryTab: DialogTab => Callback,
      providerId: String,
      setExecutionOptions: Map[String, Any] => Thenable[Unit],
      uri: String
    ): QueryDocument = {
      val __obj = js.Dynamic.literal(connect = js.Any.fromFunction1(connect), createQueryTab = js.Any.fromFunction1((t0: DialogTab) => createQueryTab(t0).runNow()), providerId = providerId.asInstanceOf[js.Any], setExecutionOptions = js.Any.fromFunction1(setExecutionOptions), uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueryDocument]
    }
    
    extension [Self <: QueryDocument](x: Self) {
      
      inline def setConnect(value: ConnectionProfile => Thenable[Unit]): Self = StObject.set(x, "connect", js.Any.fromFunction1(value))
      
      inline def setCreateQueryTab(value: DialogTab => Callback): Self = StObject.set(x, "createQueryTab", js.Any.fromFunction1((t0: DialogTab) => value(t0).runNow()))
      
      inline def setProviderId(value: String): Self = StObject.set(x, "providerId", value.asInstanceOf[js.Any])
      
      inline def setSetExecutionOptions(value: Map[String, Any] => Thenable[Unit]): Self = StObject.set(x, "setExecutionOptions", js.Any.fromFunction1(value))
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait QueryEventListener extends StObject {
    
    /**
      * A callback that is called whenever a query event occurs
      * @param type The type of query event
      * @param document The document this event was sent by
      * @param args The extra information for the event, if any
      * The args sent depend on the type of event :
      * queryStart: undefined
      * queryStop: undefined
      * executionPlan: string (the plan itself)
      * visualize: ResultSetSummary (the result set to be visualized)
      */
    def onQueryEvent(`type`: QueryEventType, document: QueryDocument): Unit = js.native
    def onQueryEvent(`type`: QueryEventType, document: QueryDocument, args: String): Unit = js.native
    def onQueryEvent(`type`: QueryEventType, document: QueryDocument, args: ResultSetSummary): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.azdata.azdataStrings.queryStart
    - typingsJapgolly.azdata.azdataStrings.queryUpdate
    - typingsJapgolly.azdata.azdataStrings.queryStop
    - typingsJapgolly.azdata.azdataStrings.executionPlan
    - typingsJapgolly.azdata.azdataStrings.visualize
  */
  trait QueryEventType extends StObject
  object QueryEventType {
    
    inline def executionPlan: typingsJapgolly.azdata.azdataStrings.executionPlan = "executionPlan".asInstanceOf[typingsJapgolly.azdata.azdataStrings.executionPlan]
    
    inline def queryStart: typingsJapgolly.azdata.azdataStrings.queryStart = "queryStart".asInstanceOf[typingsJapgolly.azdata.azdataStrings.queryStart]
    
    inline def queryStop: typingsJapgolly.azdata.azdataStrings.queryStop = "queryStop".asInstanceOf[typingsJapgolly.azdata.azdataStrings.queryStop]
    
    inline def queryUpdate: typingsJapgolly.azdata.azdataStrings.queryUpdate = "queryUpdate".asInstanceOf[typingsJapgolly.azdata.azdataStrings.queryUpdate]
    
    inline def visualize: typingsJapgolly.azdata.azdataStrings.visualize = "visualize".asInstanceOf[typingsJapgolly.azdata.azdataStrings.visualize]
  }
}
