package typingsJapgolly.apolloProtobufjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IParseOptions extends StObject {
  
  /** Recognize double-slash comments in addition to doc-block comments. */
  var alternateCommentMode: js.UndefOr[Boolean] = js.undefined
  
  /** Keeps field casing instead of converting to camel case */
  var keepCase: js.UndefOr[Boolean] = js.undefined
}
object IParseOptions {
  
  inline def apply(): IParseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IParseOptions]
  }
  
  extension [Self <: IParseOptions](x: Self) {
    
    inline def setAlternateCommentMode(value: Boolean): Self = StObject.set(x, "alternateCommentMode", value.asInstanceOf[js.Any])
    
    inline def setAlternateCommentModeUndefined: Self = StObject.set(x, "alternateCommentMode", js.undefined)
    
    inline def setKeepCase(value: Boolean): Self = StObject.set(x, "keepCase", value.asInstanceOf[js.Any])
    
    inline def setKeepCaseUndefined: Self = StObject.set(x, "keepCase", js.undefined)
  }
}
