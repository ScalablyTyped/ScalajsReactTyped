package typingsJapgolly.aliApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object my {
  type Color = java.lang.String | js.Array[scala.Double] | scala.Double | typingsJapgolly.aliApp.my.CanvasAction
  type RemoveSavedFileOptions = typingsJapgolly.aliApp.my.GetSavedFileInfoOptions
  //#region 网络 https://docs.alipay.com/mini/api/network
  type RequestHeader = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  //#endregion
  //#region 文本风险识别 https://docs.alipay.com/mini/api/text-identification
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.aliApp.aliAppStrings.keyword
    - typingsJapgolly.aliApp.aliAppStrings.`0`
    - typingsJapgolly.aliApp.aliAppStrings.`1`
    - typingsJapgolly.aliApp.aliAppStrings.`2`
    - typingsJapgolly.aliApp.aliAppStrings.`3`
    - java.lang.String
  */
  type TextRiskIdentificationType = typingsJapgolly.aliApp.my._TextRiskIdentificationType | java.lang.String
  type onMessageFun = js.Function1[/* p */ js.Any, scala.Unit]
}
