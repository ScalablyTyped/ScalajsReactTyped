package typingsJapgolly.grommet

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object es6UtilsPortalMod {
  
  @JSImport("grommet/es6/utils/portal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createPortal(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createPortal")().asInstanceOf[Unit]
  
  inline def expectPortal(portalId: String): ExpectPortalReturn = ^.asInstanceOf[js.Dynamic].applyDynamic("expectPortal")(portalId.asInstanceOf[js.Any]).asInstanceOf[ExpectPortalReturn]
  
  trait ExpectPortalReturn extends StObject {
    
    def toMatchSnapshot(): Unit
  }
  object ExpectPortalReturn {
    
    inline def apply(toMatchSnapshot: Callback): ExpectPortalReturn = {
      val __obj = js.Dynamic.literal(toMatchSnapshot = toMatchSnapshot.toJsFn)
      __obj.asInstanceOf[ExpectPortalReturn]
    }
    
    extension [Self <: ExpectPortalReturn](x: Self) {
      
      inline def setToMatchSnapshot(value: Callback): Self = StObject.set(x, "toMatchSnapshot", value.toJsFn)
    }
  }
}
