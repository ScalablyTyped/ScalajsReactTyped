package typingsJapgolly.dialogflow.mod.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.dialogflow.mod.google.protobuf.GeneratedCodeInfo.IAnnotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a GeneratedCodeInfo. */
@JSImport("dialogflow/protos/protos", "google.protobuf.GeneratedCodeInfo")
@js.native
/**
  * Constructs a new GeneratedCodeInfo.
  * @param [properties] Properties to set
  */
class GeneratedCodeInfo_ () extends IGeneratedCodeInfo {
  def this(properties: IGeneratedCodeInfo) = this()
  /** GeneratedCodeInfo annotation. */
  @JSName("annotation")
  var annotation_GeneratedCodeInfo_ : js.Array[IAnnotation] = js.native
  /**
    * Converts this GeneratedCodeInfo to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

