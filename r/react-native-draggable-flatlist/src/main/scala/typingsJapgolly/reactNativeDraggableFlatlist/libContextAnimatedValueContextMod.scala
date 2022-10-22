package typingsJapgolly.reactNativeDraggableFlatlist

import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactNativeDraggableFlatlist.anon.ActivationDistance
import typingsJapgolly.reactNativeDraggableFlatlist.anon.Children
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libContextAnimatedValueContextMod {
  
  @JSImport("react-native-draggable-flatlist/lib/context/animatedValueContext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasChildren: Children): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def useAnimatedValues(): ActivationDistance = ^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedValues")().asInstanceOf[ActivationDistance]
}
