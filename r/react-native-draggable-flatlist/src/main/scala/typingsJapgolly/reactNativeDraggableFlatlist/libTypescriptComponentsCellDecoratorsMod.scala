package typingsJapgolly.reactNativeDraggableFlatlist

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactNativeDraggableFlatlist.anon.OnActiveAnim
import typingsJapgolly.reactNativeDraggableFlatlist.libTypescriptHooksUseOnCellActiveAnimationMod.Params
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptComponentsCellDecoratorsMod {
  
  @JSImport("react-native-draggable-flatlist/lib/typescript/components/CellDecorators", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def OpacityDecorator(hasActiveOpacityChildren: OpacityProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("OpacityDecorator")(hasActiveOpacityChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def ScaleDecorator(hasActiveScaleChildren: ScaleProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ScaleDecorator")(hasActiveScaleChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def ShadowDecorator(hasElevationColorOpacityRadiusChildren: ShadowProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ShadowDecorator")(hasElevationColorOpacityRadiusChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def useOnCellActiveAnimation(): OnActiveAnim = ^.asInstanceOf[js.Dynamic].applyDynamic("useOnCellActiveAnimation")().asInstanceOf[OnActiveAnim]
  inline def useOnCellActiveAnimation(hasAnimationConfig: Params): OnActiveAnim = ^.asInstanceOf[js.Dynamic].applyDynamic("useOnCellActiveAnimation")(hasAnimationConfig.asInstanceOf[js.Any]).asInstanceOf[OnActiveAnim]
  
  trait OpacityProps extends StObject {
    
    var activeOpacity: js.UndefOr[Double] = js.undefined
    
    var children: Node
  }
  object OpacityProps {
    
    inline def apply(): OpacityProps = {
      val __obj = js.Dynamic.literal(children = null)
      __obj.asInstanceOf[OpacityProps]
    }
    
    extension [Self <: OpacityProps](x: Self) {
      
      inline def setActiveOpacity(value: Double): Self = StObject.set(x, "activeOpacity", value.asInstanceOf[js.Any])
      
      inline def setActiveOpacityUndefined: Self = StObject.set(x, "activeOpacity", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  trait ScaleProps extends StObject {
    
    var activeScale: js.UndefOr[Double] = js.undefined
    
    var children: Node
  }
  object ScaleProps {
    
    inline def apply(): ScaleProps = {
      val __obj = js.Dynamic.literal(children = null)
      __obj.asInstanceOf[ScaleProps]
    }
    
    extension [Self <: ScaleProps](x: Self) {
      
      inline def setActiveScale(value: Double): Self = StObject.set(x, "activeScale", value.asInstanceOf[js.Any])
      
      inline def setActiveScaleUndefined: Self = StObject.set(x, "activeScale", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  trait ShadowProps extends StObject {
    
    var children: Node
    
    var color: js.UndefOr[String] = js.undefined
    
    var elevation: js.UndefOr[Double] = js.undefined
    
    var opacity: js.UndefOr[Double] = js.undefined
    
    var radius: js.UndefOr[Double] = js.undefined
  }
  object ShadowProps {
    
    inline def apply(): ShadowProps = {
      val __obj = js.Dynamic.literal(children = null)
      __obj.asInstanceOf[ShadowProps]
    }
    
    extension [Self <: ShadowProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setElevation(value: Double): Self = StObject.set(x, "elevation", value.asInstanceOf[js.Any])
      
      inline def setElevationUndefined: Self = StObject.set(x, "elevation", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    }
  }
}
