package typingsJapgolly.baseui

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.baseui.baseuiInts.`1`
import typingsJapgolly.baseui.baseuiInts.`2`
import typingsJapgolly.baseui.baseuiInts.`3`
import typingsJapgolly.baseui.baseuiInts.`4`
import typingsJapgolly.baseui.baseuiInts.`5`
import typingsJapgolly.baseui.baseuiInts.`6`
import typingsJapgolly.baseui.baseuiStrings.h1
import typingsJapgolly.baseui.blockTypesMod.BlockProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object headingTypesMod {
  
  trait HeadingLevelProps extends StObject {
    
    /** Content to be rendered in the HeadingLevel. */
    var children: Node
  }
  object HeadingLevelProps {
    
    inline def apply(): HeadingLevelProps = {
      val __obj = js.Dynamic.literal(children = null)
      __obj.asInstanceOf[HeadingLevelProps]
    }
    
    extension [Self <: HeadingLevelProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  trait HeadingProps
    extends StObject
       with BlockProps[h1] {
    
    /** Set and fix the style level independently on the hierarchy context. */
    var styleLevel: js.UndefOr[`1` | `2` | `3` | `4` | `5` | `6`] = js.undefined
  }
  object HeadingProps {
    
    inline def apply(): HeadingProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HeadingProps]
    }
    
    extension [Self <: HeadingProps](x: Self) {
      
      inline def setStyleLevel(value: `1` | `2` | `3` | `4` | `5` | `6`): Self = StObject.set(x, "styleLevel", value.asInstanceOf[js.Any])
      
      inline def setStyleLevelUndefined: Self = StObject.set(x, "styleLevel", js.undefined)
    }
  }
}
