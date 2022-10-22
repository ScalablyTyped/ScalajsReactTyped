package typingsJapgolly.victoryStack

import typingsJapgolly.victoryStack.anon.Categories
import typingsJapgolly.victoryStack.anon.Domain
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esHelperMethodsMod {
  
  @JSImport("victory-stack/es/helper-methods", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getCalculatedProps(props: Any, childComponents: Any): Categories = (^.asInstanceOf[js.Dynamic].applyDynamic("getCalculatedProps")(props.asInstanceOf[js.Any], childComponents.asInstanceOf[js.Any])).asInstanceOf[Categories]
  
  inline def getChildProps(props: Any, calculatedProps: Any): Domain = (^.asInstanceOf[js.Dynamic].applyDynamic("getChildProps")(props.asInstanceOf[js.Any], calculatedProps.asInstanceOf[js.Any])).asInstanceOf[Domain]
  
  inline def getChildren(props: Any, childComponents: Any, calculatedProps: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getChildren")(props.asInstanceOf[js.Any], childComponents.asInstanceOf[js.Any], calculatedProps.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def useMemoizedProps(initialProps: Any): Categories = ^.asInstanceOf[js.Dynamic].applyDynamic("useMemoizedProps")(initialProps.asInstanceOf[js.Any]).asInstanceOf[Categories]
}
