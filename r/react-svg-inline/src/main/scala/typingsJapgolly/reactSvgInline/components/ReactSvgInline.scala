package typingsJapgolly.reactSvgInline.components

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactSvgInline.mod.SVGInlineProps
import typingsJapgolly.reactSvgInline.mod.^
import typingsJapgolly.reactSvgInline.reactSvgInlineStrings.comment
import typingsJapgolly.reactSvgInline.reactSvgInlineStrings.defs
import typingsJapgolly.reactSvgInline.reactSvgInlineStrings.desc
import typingsJapgolly.reactSvgInline.reactSvgInlineStrings.fill
import typingsJapgolly.reactSvgInline.reactSvgInlineStrings.height
import typingsJapgolly.reactSvgInline.reactSvgInlineStrings.sketchMSLayerGroup
import typingsJapgolly.reactSvgInline.reactSvgInlineStrings.sketchMSPage
import typingsJapgolly.reactSvgInline.reactSvgInlineStrings.sketchMSShapeGroup
import typingsJapgolly.reactSvgInline.reactSvgInlineStrings.title
import typingsJapgolly.reactSvgInline.reactSvgInlineStrings.width
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactSvgInline {
  
  inline def apply(svg: String): Builder = {
    val __props = js.Dynamic.literal(svg = svg.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[SVGInlineProps & js.Object]))
  }
  
  object ReactSvgInline {
    
    inline def apply(svg: String): typingsJapgolly.reactSvgInline.components.ReactSvgInline.ReactSvgInline.Builder = {
      val __props = js.Dynamic.literal(svg = svg.asInstanceOf[js.Any])
      new typingsJapgolly.reactSvgInline.components.ReactSvgInline.ReactSvgInline.Builder(js.Array(this.component, __props.asInstanceOf[SVGInlineProps]))
    }
    
    @JSImport("react-svg-inline", JSImport.Namespace)
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[^] {
      
      inline def accessibilityDesc(value: String): this.type = set("accessibilityDesc", value.asInstanceOf[js.Any])
      
      inline def accessibilityLabel(value: String): this.type = set("accessibilityLabel", value.asInstanceOf[js.Any])
      
      inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      
      inline def classSuffix(value: String): this.type = set("classSuffix", value.asInstanceOf[js.Any])
      
      inline def cleanup(
        value: Boolean | (js.Array[
              title | desc | comment | defs | width | height | fill | sketchMSShapeGroup | sketchMSPage | sketchMSLayerGroup
            ])
      ): this.type = set("cleanup", value.asInstanceOf[js.Any])
      
      inline def cleanupExceptions(
        value: js.Array[
              title | desc | comment | defs | width | height | fill | sketchMSShapeGroup | sketchMSPage | sketchMSLayerGroup
            ]
      ): this.type = set("cleanupExceptions", value.asInstanceOf[js.Any])
      
      inline def cleanupExceptionsVarargs(
        value: (title | desc | comment | defs | width | height | fill | sketchMSShapeGroup | sketchMSPage | sketchMSLayerGroup)*
      ): this.type = set("cleanupExceptions", js.Array(value*))
      
      inline def cleanupVarargs(
        value: (title | desc | comment | defs | width | height | fill | sketchMSShapeGroup | sketchMSPage | sketchMSLayerGroup)*
      ): this.type = set("cleanup", js.Array(value*))
      
      inline def component(value: ElementType): this.type = set("component", value.asInstanceOf[js.Any])
      
      inline def fill(value: String): this.type = set("fill", value.asInstanceOf[js.Any])
      
      inline def height(value: String): this.type = set("height", value.asInstanceOf[js.Any])
      
      inline def width(value: String): this.type = set("width", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: SVGInlineProps): typingsJapgolly.reactSvgInline.components.ReactSvgInline.ReactSvgInline.Builder = new typingsJapgolly.reactSvgInline.components.ReactSvgInline.ReactSvgInline.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("react-svg-inline", JSImport.Namespace)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def accessibilityDesc(value: String): this.type = set("accessibilityDesc", value.asInstanceOf[js.Any])
    
    inline def accessibilityLabel(value: String): this.type = set("accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def classSuffix(value: String): this.type = set("classSuffix", value.asInstanceOf[js.Any])
    
    inline def cleanup(
      value: Boolean | (js.Array[
          title | desc | comment | defs | width | height | fill | sketchMSShapeGroup | sketchMSPage | sketchMSLayerGroup
        ])
    ): this.type = set("cleanup", value.asInstanceOf[js.Any])
    
    inline def cleanupExceptions(
      value: js.Array[
          title | desc | comment | defs | width | height | fill | sketchMSShapeGroup | sketchMSPage | sketchMSLayerGroup
        ]
    ): this.type = set("cleanupExceptions", value.asInstanceOf[js.Any])
    
    inline def cleanupExceptionsVarargs(
      value: (title | desc | comment | defs | width | height | fill | sketchMSShapeGroup | sketchMSPage | sketchMSLayerGroup)*
    ): this.type = set("cleanupExceptions", js.Array(value*))
    
    inline def cleanupVarargs(
      value: (title | desc | comment | defs | width | height | fill | sketchMSShapeGroup | sketchMSPage | sketchMSLayerGroup)*
    ): this.type = set("cleanup", js.Array(value*))
    
    inline def component(value: ElementType): this.type = set("component", value.asInstanceOf[js.Any])
    
    inline def fill(value: String): this.type = set("fill", value.asInstanceOf[js.Any])
    
    inline def height(value: String): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def width(value: String): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SVGInlineProps & js.Object): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
