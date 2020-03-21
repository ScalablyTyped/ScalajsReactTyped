package typingsJapgolly.inversify.interfacesMod.interfaces

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetadataReader extends js.Object {
  def getConstructorMetadata(constructorFunc: js.Function): ConstructorMetadata
  def getPropertiesMetadata(constructorFunc: js.Function): MetadataMap
}

object MetadataReader {
  @scala.inline
  def apply(
    getConstructorMetadata: js.Function => CallbackTo[ConstructorMetadata],
    getPropertiesMetadata: js.Function => CallbackTo[MetadataMap]
  ): MetadataReader = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getConstructorMetadata")(js.Any.fromFunction1((t0: js.Function) => getConstructorMetadata(t0).runNow()))
    __obj.updateDynamic("getPropertiesMetadata")(js.Any.fromFunction1((t0: js.Function) => getPropertiesMetadata(t0).runNow()))
    __obj.asInstanceOf[MetadataReader]
  }
}

