package typingsJapgolly.atom.anon

import typingsJapgolly.atom.atomStrings.backward
import typingsJapgolly.atom.atomStrings.closest
import typingsJapgolly.atom.atomStrings.forward
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClipDirectionReversed extends StObject {
  
  var clipDirection: js.UndefOr[backward | forward | closest] = js.undefined
  
  var reversed: js.UndefOr[Boolean] = js.undefined
}
object ClipDirectionReversed {
  
  inline def apply(): ClipDirectionReversed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClipDirectionReversed]
  }
  
  extension [Self <: ClipDirectionReversed](x: Self) {
    
    inline def setClipDirection(value: backward | forward | closest): Self = StObject.set(x, "clipDirection", value.asInstanceOf[js.Any])
    
    inline def setClipDirectionUndefined: Self = StObject.set(x, "clipDirection", js.undefined)
    
    inline def setReversed(value: Boolean): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
    
    inline def setReversedUndefined: Self = StObject.set(x, "reversed", js.undefined)
  }
}
