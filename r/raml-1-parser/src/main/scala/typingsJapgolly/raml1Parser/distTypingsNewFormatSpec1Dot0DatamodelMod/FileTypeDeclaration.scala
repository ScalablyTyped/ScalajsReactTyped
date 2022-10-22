package typingsJapgolly.raml1Parser.distTypingsNewFormatSpec1Dot0DatamodelMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileTypeDeclaration
  extends StObject
     with TypeDeclaration {
  
  /**
    * A list of valid content-type strings for the file.
    */
  var fileTypes: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The maxLength attribute specifies the parameter value's maximum number of bytes.
    */
  var maxLength: js.UndefOr[Double] = js.undefined
  
  /**
    * The minLength attribute specifies the parameter value's minimum number of bytes.
    */
  var minLength: js.UndefOr[Double] = js.undefined
}
object FileTypeDeclaration {
  
  inline def apply(displayName: String, name: String, `type`: js.Array[TypeReference10]): FileTypeDeclaration = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileTypeDeclaration]
  }
  
  extension [Self <: FileTypeDeclaration](x: Self) {
    
    inline def setFileTypes(value: js.Array[String]): Self = StObject.set(x, "fileTypes", value.asInstanceOf[js.Any])
    
    inline def setFileTypesUndefined: Self = StObject.set(x, "fileTypes", js.undefined)
    
    inline def setFileTypesVarargs(value: String*): Self = StObject.set(x, "fileTypes", js.Array(value*))
    
    inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    
    inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
    
    inline def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
    
    inline def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
  }
}
