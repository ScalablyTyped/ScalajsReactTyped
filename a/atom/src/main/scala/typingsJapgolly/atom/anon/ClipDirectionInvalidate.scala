package typingsJapgolly.atom.anon

import typingsJapgolly.atom.atomStrings.backward
import typingsJapgolly.atom.atomStrings.closest
import typingsJapgolly.atom.atomStrings.forward
import typingsJapgolly.atom.atomStrings.inside
import typingsJapgolly.atom.atomStrings.never
import typingsJapgolly.atom.atomStrings.overlap
import typingsJapgolly.atom.atomStrings.surround
import typingsJapgolly.atom.atomStrings.touch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClipDirectionInvalidate extends StObject {
  
  var clipDirection: js.UndefOr[backward | forward | closest] = js.undefined
  
  var invalidate: js.UndefOr[never | surround | overlap | inside | touch] = js.undefined
}
object ClipDirectionInvalidate {
  
  inline def apply(): ClipDirectionInvalidate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClipDirectionInvalidate]
  }
  
  extension [Self <: ClipDirectionInvalidate](x: Self) {
    
    inline def setClipDirection(value: backward | forward | closest): Self = StObject.set(x, "clipDirection", value.asInstanceOf[js.Any])
    
    inline def setClipDirectionUndefined: Self = StObject.set(x, "clipDirection", js.undefined)
    
    inline def setInvalidate(value: never | surround | overlap | inside | touch): Self = StObject.set(x, "invalidate", value.asInstanceOf[js.Any])
    
    inline def setInvalidateUndefined: Self = StObject.set(x, "invalidate", js.undefined)
  }
}
