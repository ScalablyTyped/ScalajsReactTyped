package typingsJapgolly.aliApp.my

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Color = String | js.Array[Double] | Double | CanvasAction

type RemoveSavedFileOptions = GetSavedFileInfoOptions

//#region 网络 https://docs.alipay.com/mini/api/network
type RequestHeader = StringDictionary[String]

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
type TextRiskIdentificationType = _TextRiskIdentificationType | String

type onMessageFun = js.Function1[/* p */ Any, Unit]
