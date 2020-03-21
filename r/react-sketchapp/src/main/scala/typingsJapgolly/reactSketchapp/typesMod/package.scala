package typingsJapgolly.reactSketchapp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type Color = java.lang.String | scala.Double
  type LayerCreator = js.Function5[
    /* style */ typingsJapgolly.reactSketchapp.typesMod.ViewStyle, 
    /* layout */ typingsJapgolly.reactSketchapp.typesMod.LayoutInfo, 
    /* textStyle */ typingsJapgolly.reactSketchapp.typesMod.TextStyle, 
    /* props */ js.Any, 
    /* value */ js.UndefOr[java.lang.String], 
    typingsJapgolly.reactSketchapp.typesMod.SketchLayer
  ]
  type MSColor = js.Any
  type MSGradient = js.Any
  type NSString = js.Any
  type SketchLayer = js.Any
  type SketchShadows = js.Array[typingsJapgolly.reactSketchapp.typesMod.SketchShadow]
  type SketchStyle = js.Any
  type TextNodes = js.Array[typingsJapgolly.reactSketchapp.typesMod.TextNode]
}
