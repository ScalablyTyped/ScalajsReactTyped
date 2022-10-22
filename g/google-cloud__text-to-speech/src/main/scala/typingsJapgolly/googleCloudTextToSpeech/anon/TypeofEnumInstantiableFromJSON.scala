package typingsJapgolly.googleCloudTextToSpeech.anon

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.googleGax.mod.protobufMinimal.Enum
import typingsJapgolly.protobufjs.mod.IEnum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofEnumInstantiableFromJSON
  extends StObject
     with Instantiable1[/* name */ String, Enum] {
  
  /**
    * Constructs an enum from an enum descriptor.
    * @param name Enum name
    * @param json Enum descriptor
    * @returns Created enum
    * @throws {TypeError} If arguments are invalid
    */
  def fromJSON(name: String, json: IEnum): typingsJapgolly.protobufjs.mod.Enum = js.native
}
