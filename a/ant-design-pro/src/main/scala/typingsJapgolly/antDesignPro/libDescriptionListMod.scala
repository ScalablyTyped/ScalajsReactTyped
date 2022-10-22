package typingsJapgolly.antDesignPro

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.antDesignPro.antDesignProStrings.horizontal
import typingsJapgolly.antDesignPro.antDesignProStrings.large
import typingsJapgolly.antDesignPro.antDesignProStrings.small
import typingsJapgolly.antDesignPro.antDesignProStrings.vertical
import typingsJapgolly.antDesignPro.libDescriptionListDescriptionMod.DescriptionProps
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDescriptionListMod {
  
  @JSImport("ant-design-pro/lib/DescriptionList", JSImport.Default)
  @js.native
  open class default () extends Component[DescriptionListProps, Any, Any]
  /* static members */
  object default {
    
    @JSImport("ant-design-pro/lib/DescriptionList", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ant-design-pro/lib/DescriptionList", "default.Description")
    @js.native
    def Description: Instantiable0[typingsJapgolly.antDesignPro.libDescriptionListDescriptionMod.default] = js.native
    inline def Description_=(x: Instantiable0[typingsJapgolly.antDesignPro.libDescriptionListDescriptionMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Description")(x.asInstanceOf[js.Any])
  }
  
  type DescriptionList = japgolly.scalajs.react.facade.React.Component[DescriptionListProps & js.Object, js.Object]
  
  trait DescriptionListProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var col: js.UndefOr[Double] = js.undefined
    
    var description: js.UndefOr[js.Array[DescriptionProps]] = js.undefined
    
    var gutter: js.UndefOr[Double] = js.undefined
    
    var layout: js.UndefOr[horizontal | vertical] = js.undefined
    
    var size: js.UndefOr[large | small] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var title: js.UndefOr[Node] = js.undefined
  }
  object DescriptionListProps {
    
    inline def apply(): DescriptionListProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DescriptionListProps]
    }
    
    extension [Self <: DescriptionListProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCol(value: Double): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
      
      inline def setColUndefined: Self = StObject.set(x, "col", js.undefined)
      
      inline def setDescription(value: js.Array[DescriptionProps]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setDescriptionVarargs(value: DescriptionProps*): Self = StObject.set(x, "description", js.Array(value*))
      
      inline def setGutter(value: Double): Self = StObject.set(x, "gutter", value.asInstanceOf[js.Any])
      
      inline def setGutterUndefined: Self = StObject.set(x, "gutter", js.undefined)
      
      inline def setLayout(value: horizontal | vertical): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      inline def setSize(value: large | small): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTitle(value: VdomNode): Self = StObject.set(x, "title", value.rawNode.asInstanceOf[js.Any])
      
      inline def setTitleNull: Self = StObject.set(x, "title", null)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTitleVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "title", js.Array(value*))
      
      inline def setTitleVdomElement(value: VdomElement): Self = StObject.set(x, "title", value.rawElement.asInstanceOf[js.Any])
    }
  }
}
