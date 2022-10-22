package typingsJapgolly.reactExpandAnimated

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.ElementType
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.csstype.mod.Property.TransitionTimingFunction
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactExpandAnimated.anon.Close
import typingsJapgolly.reactExpandAnimated.reactExpandAnimatedStrings.hack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("react-expand-animated", JSImport.Default)
  @js.native
  val default: ComponentType[ExpandProps] = js.native
  
  trait ExpandProps extends StObject {
    
    /**
      * The expanded or collapsed content
      */
    var children: Node
    
    /**
      * Wrapper's className
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Animation duration in ms
      */
    var duration: js.UndefOr[Double] = js.undefined
    
    /**
      * Css3 Animation's type
      */
    var easing: js.UndefOr[TransitionTimingFunction] = js.undefined
    
    /**
      * When set to true expand the children component otherwise collapse it
      */
    var open: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Additional inline-styles on open or close phase
      *
      * @example { open: { marginTop: 100 }, close: { marginTop: 0 } }
      */
    var styles: js.UndefOr[Close] = js.undefined
    
    /**
      * Wrapper's tag
      */
    var tag: js.UndefOr[ElementType] = js.undefined
    
    /**
      * Transition attributes
      */
    var transitions: js.UndefOr[js.Array[hack]] = js.undefined
  }
  object ExpandProps {
    
    inline def apply(): ExpandProps = {
      val __obj = js.Dynamic.literal(children = null)
      __obj.asInstanceOf[ExpandProps]
    }
    
    extension [Self <: ExpandProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setEasing(value: TransitionTimingFunction): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setStyles(value: Close): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setTag(value: ElementType): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      inline def setTransitions(value: js.Array[hack]): Self = StObject.set(x, "transitions", value.asInstanceOf[js.Any])
      
      inline def setTransitionsUndefined: Self = StObject.set(x, "transitions", js.undefined)
      
      inline def setTransitionsVarargs(value: hack*): Self = StObject.set(x, "transitions", js.Array(value*))
    }
  }
  
  type _To = ComponentType[ExpandProps]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: ComponentType[ExpandProps] = default
}
