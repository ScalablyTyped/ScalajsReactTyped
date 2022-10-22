package typingsJapgolly.std.Intl

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Segmenter extends StObject {
  
  /* standard es2022.intl */
  def resolvedOptions(): ResolvedSegmenterOptions
  
  /**
    * Returns `Segments` object containing the segments of the input string, using the segmenter's locale and granularity.
    *
    * @param input - The text to be segmented as a `string`.
    *
    * @returns A new iterable Segments object containing the segments of the input string, using the segmenter's locale and granularity.
    */
  /* standard es2022.intl */
  def segment(input: String): Segments
}
object Segmenter {
  
  inline def apply(resolvedOptions: CallbackTo[ResolvedSegmenterOptions], segment: String => Segments): Segmenter = {
    val __obj = js.Dynamic.literal(resolvedOptions = resolvedOptions.toJsFn, segment = js.Any.fromFunction1(segment))
    __obj.asInstanceOf[Segmenter]
  }
  
  extension [Self <: Segmenter](x: Self) {
    
    inline def setResolvedOptions(value: CallbackTo[ResolvedSegmenterOptions]): Self = StObject.set(x, "resolvedOptions", value.toJsFn)
    
    inline def setSegment(value: String => Segments): Self = StObject.set(x, "segment", js.Any.fromFunction1(value))
  }
}
