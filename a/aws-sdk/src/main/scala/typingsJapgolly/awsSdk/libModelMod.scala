package typingsJapgolly.awsSdk

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModelMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.libModelMod.Scalar
    - typingsJapgolly.awsSdk.libModelMod.Structure
    - typingsJapgolly.awsSdk.libModelMod.List
  */
  type DocumentType = _DocumentType | Scalar
  
  @js.native
  trait List
    extends StObject
       with Array[DocumentType]
       with _DocumentType
  
  type Scalar = String | Double | Boolean | Null
  
  trait Structure
    extends StObject
       with /* member */ StringDictionary[DocumentType]
       with _DocumentType
  object Structure {
    
    inline def apply(): Structure = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Structure]
    }
  }
  
  trait _DocumentType extends StObject
}
