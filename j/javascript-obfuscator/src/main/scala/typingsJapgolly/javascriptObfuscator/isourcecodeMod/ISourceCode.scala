package typingsJapgolly.javascriptObfuscator.isourcecodeMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISourceCode extends js.Object {
  /**
    * @returns string
    */
  def getSourceCode(): String
  /**
    * @returns string
    */
  def getSourceMap(): String
}

object ISourceCode {
  @scala.inline
  def apply(getSourceCode: CallbackTo[String], getSourceMap: CallbackTo[String]): ISourceCode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getSourceCode")(getSourceCode.toJsFn)
    __obj.updateDynamic("getSourceMap")(getSourceMap.toJsFn)
    __obj.asInstanceOf[ISourceCode]
  }
}

