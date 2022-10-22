package typingsJapgolly.oracleOraclejet

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.Element
import typingsJapgolly.oracleOraclejet.anon.Description
import typingsJapgolly.oracleOraclejet.anon.DescriptionId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ojcontextMod {
  
  @JSImport("@oracle/oraclejet/ojcontext", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Context {
    
    /* CompleteClass */
    override def getBusyContext(): BusyContext = js.native
  }
  @JSImport("@oracle/oraclejet/ojcontext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def getContext(node: Element): Context = ^.asInstanceOf[js.Dynamic].applyDynamic("getContext")(node.asInstanceOf[js.Any]).asInstanceOf[Context]
  
  /* static member */
  inline def getPageContext(): Context = ^.asInstanceOf[js.Dynamic].applyDynamic("getPageContext")().asInstanceOf[Context]
  
  /* static member */
  inline def setBusyContextDefaultTimeout(timeout: Double): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("setBusyContextDefaultTimeout")(timeout.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @js.native
  trait BusyContext extends StObject {
    
    def addBusyState(options: Description): js.Function0[Unit] = js.native
    
    def applicationBootstrapComplete(): Unit = js.native
    
    def clear(): Unit = js.native
    
    def dump(): Unit = js.native
    def dump(message: String): Unit = js.native
    
    def getBusyStates(): js.Array[DescriptionId] = js.native
    
    def isReady(): Boolean = js.native
    
    def whenReady(): js.Promise[Boolean | js.Error] = js.native
    def whenReady(timeout: Double): js.Promise[Boolean | js.Error] = js.native
  }
  
  trait Context extends StObject {
    
    def getBusyContext(): BusyContext
  }
  object Context {
    
    inline def apply(getBusyContext: CallbackTo[BusyContext]): Context = {
      val __obj = js.Dynamic.literal(getBusyContext = getBusyContext.toJsFn)
      __obj.asInstanceOf[Context]
    }
    
    extension [Self <: Context](x: Self) {
      
      inline def setGetBusyContext(value: CallbackTo[BusyContext]): Self = StObject.set(x, "getBusyContext", value.toJsFn)
    }
  }
}
