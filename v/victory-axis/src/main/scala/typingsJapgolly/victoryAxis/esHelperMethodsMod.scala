package typingsJapgolly.victoryAxis

import typingsJapgolly.victoryAxis.anon.Axis
import typingsJapgolly.victoryAxis.anon.Parent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esHelperMethodsMod {
  
  @JSImport("victory-axis/es/helper-methods", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getBaseProps(props: Any, fallbackProps: Any): Parent = (^.asInstanceOf[js.Dynamic].applyDynamic("getBaseProps")(props.asInstanceOf[js.Any], fallbackProps.asInstanceOf[js.Any])).asInstanceOf[Parent]
  
  inline def getStyles(props: Any): Axis = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")(props.asInstanceOf[js.Any]).asInstanceOf[Axis]
  inline def getStyles(props: Any, styleObject: Any): Axis = (^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")(props.asInstanceOf[js.Any], styleObject.asInstanceOf[js.Any])).asInstanceOf[Axis]
}
