package typingsJapgolly.bizcharts.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antvComponent.libTypesMod.EnhancedTextBackgroundCfg
import typingsJapgolly.antvG2.antvG2Strings.head
import typingsJapgolly.antvG2.antvG2Strings.middle
import typingsJapgolly.antvG2.antvG2Strings.tail
import typingsJapgolly.antvG2.libInterfaceMod.ComponentAnimateOption
import typingsJapgolly.antvGBase.libTypesMod.ShapeAttrs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_AnnotationTextProps_441524409[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def animate(value: Boolean): this.type = set("animate", value.asInstanceOf[js.Any])
  
  inline def animateOption(value: ComponentAnimateOption): this.type = set("animateOption", value.asInstanceOf[js.Any])
  
  inline def autoEllipsis(value: Boolean): this.type = set("autoEllipsis", value.asInstanceOf[js.Any])
  
  inline def background(value: EnhancedTextBackgroundCfg): this.type = set("background", value.asInstanceOf[js.Any])
  
  inline def chartIns(value: Any): this.type = set("chartIns", value.asInstanceOf[js.Any])
  
  inline def content(value: String | Double | (js.Function1[/* filteredData */ js.Array[js.Object], String | Double])): this.type = set("content", value.asInstanceOf[js.Any])
  
  inline def contentFunction1(value: /* filteredData */ js.Array[js.Object] => String | Double): this.type = set("content", js.Any.fromFunction1(value))
  
  inline def ellipsisPosition(value: head | middle | tail): this.type = set("ellipsisPosition", value.asInstanceOf[js.Any])
  
  inline def isVertical(value: Boolean): this.type = set("isVertical", value.asInstanceOf[js.Any])
  
  inline def maxLength(value: Double): this.type = set("maxLength", value.asInstanceOf[js.Any])
  
  inline def offsetX(value: Double): this.type = set("offsetX", value.asInstanceOf[js.Any])
  
  inline def offsetY(value: Double): this.type = set("offsetY", value.asInstanceOf[js.Any])
  
  inline def rotate(value: Double): this.type = set("rotate", value.asInstanceOf[js.Any])
  
  inline def style(value: ShapeAttrs): this.type = set("style", value.asInstanceOf[js.Any])
  
  inline def top(value: Boolean): this.type = set("top", value.asInstanceOf[js.Any])
  
  inline def `type`(value: String): this.type = set("type", value.asInstanceOf[js.Any])
}
