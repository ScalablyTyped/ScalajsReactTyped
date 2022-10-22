package typingsJapgolly.rangesPush

import typingsJapgolly.rangesPush.rangesPushInts.`1`
import typingsJapgolly.rangesPush.rangesPushInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<ranges-push.ranges-push.Opts> */
  trait PartialOpts extends StObject {
    
    var limitLinebreaksCount: js.UndefOr[Double] = js.undefined
    
    var limitToBeAddedWhitespace: js.UndefOr[Boolean] = js.undefined
    
    var mergeType: js.UndefOr[
        `1` | `2` | typingsJapgolly.rangesPush.rangesPushStrings.`1` | typingsJapgolly.rangesPush.rangesPushStrings.`2`
      ] = js.undefined
  }
  object PartialOpts {
    
    inline def apply(): PartialOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOpts]
    }
    
    extension [Self <: PartialOpts](x: Self) {
      
      inline def setLimitLinebreaksCount(value: Double): Self = StObject.set(x, "limitLinebreaksCount", value.asInstanceOf[js.Any])
      
      inline def setLimitLinebreaksCountUndefined: Self = StObject.set(x, "limitLinebreaksCount", js.undefined)
      
      inline def setLimitToBeAddedWhitespace(value: Boolean): Self = StObject.set(x, "limitToBeAddedWhitespace", value.asInstanceOf[js.Any])
      
      inline def setLimitToBeAddedWhitespaceUndefined: Self = StObject.set(x, "limitToBeAddedWhitespace", js.undefined)
      
      inline def setMergeType(
        value: `1` | `2` | typingsJapgolly.rangesPush.rangesPushStrings.`1` | typingsJapgolly.rangesPush.rangesPushStrings.`2`
      ): Self = StObject.set(x, "mergeType", value.asInstanceOf[js.Any])
      
      inline def setMergeTypeUndefined: Self = StObject.set(x, "mergeType", js.undefined)
    }
  }
}
