package typingsJapgolly.googleCloudTextToSpeech.anon

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.protobufjs.mod.INamespace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofcommon extends StObject {
  
  def apply(name: String, json: StringDictionary[Any]): Unit = js.native
  
  /**
    * Gets the root definition of the specified common proto file.
    *
    * Bundled definitions are:
    * - google/protobuf/any.proto
    * - google/protobuf/duration.proto
    * - google/protobuf/empty.proto
    * - google/protobuf/field_mask.proto
    * - google/protobuf/struct.proto
    * - google/protobuf/timestamp.proto
    * - google/protobuf/wrappers.proto
    *
    * @param file Proto file name
    * @returns Root definition or `null` if not defined
    */
  def get(file: String): INamespace | Null = js.native
}
