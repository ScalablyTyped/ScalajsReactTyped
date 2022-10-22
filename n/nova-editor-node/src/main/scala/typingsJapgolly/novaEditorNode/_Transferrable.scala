package typingsJapgolly.novaEditorNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _Transferrable extends StObject
object _Transferrable {
  
  inline def Color(
    components: js.Array[Double],
    convert: ColorFormat => typingsJapgolly.novaEditorNode.Color,
    format: ColorFormat
  ): typingsJapgolly.novaEditorNode.Color = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any], convert = js.Any.fromFunction1(convert), format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.novaEditorNode.Color]
  }
  
  inline def Range(
    compare: typingsJapgolly.novaEditorNode.Range => Double,
    containsIndex: Double => Boolean,
    containsRange: typingsJapgolly.novaEditorNode.Range => Boolean,
    empty: Boolean,
    end: Double,
    intersection: typingsJapgolly.novaEditorNode.Range => typingsJapgolly.novaEditorNode.Range,
    intersectsRange: typingsJapgolly.novaEditorNode.Range => Boolean,
    isEqual: typingsJapgolly.novaEditorNode.Range => Boolean,
    length: Double,
    start: Double,
    union: typingsJapgolly.novaEditorNode.Range => typingsJapgolly.novaEditorNode.Range
  ): typingsJapgolly.novaEditorNode.Range = {
    val __obj = js.Dynamic.literal(compare = js.Any.fromFunction1(compare), containsIndex = js.Any.fromFunction1(containsIndex), containsRange = js.Any.fromFunction1(containsRange), empty = empty.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], intersection = js.Any.fromFunction1(intersection), intersectsRange = js.Any.fromFunction1(intersectsRange), isEqual = js.Any.fromFunction1(isEqual), length = length.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], union = js.Any.fromFunction1(union))
    __obj.asInstanceOf[typingsJapgolly.novaEditorNode.Range]
  }
}
