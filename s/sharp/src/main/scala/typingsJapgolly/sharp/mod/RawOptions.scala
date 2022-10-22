package typingsJapgolly.sharp.mod

import typingsJapgolly.sharp.sharpStrings.char
import typingsJapgolly.sharp.sharpStrings.complex
import typingsJapgolly.sharp.sharpStrings.double
import typingsJapgolly.sharp.sharpStrings.dpcomplex
import typingsJapgolly.sharp.sharpStrings.float
import typingsJapgolly.sharp.sharpStrings.int
import typingsJapgolly.sharp.sharpStrings.short
import typingsJapgolly.sharp.sharpStrings.uchar
import typingsJapgolly.sharp.sharpStrings.uint
import typingsJapgolly.sharp.sharpStrings.ushort
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RawOptions extends StObject {
  
  var depth: js.UndefOr[
    char | uchar | short | ushort | int | uint | float | complex | double | dpcomplex
  ] = js.undefined
}
object RawOptions {
  
  inline def apply(): RawOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RawOptions]
  }
  
  extension [Self <: RawOptions](x: Self) {
    
    inline def setDepth(value: char | uchar | short | ushort | int | uint | float | complex | double | dpcomplex): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    inline def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
  }
}
