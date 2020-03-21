package typingsJapgolly.dwt

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DynamsoftLib extends js.Object {
  /*ignored
    Addon_Events  Addon_Sendback_Events  AttachAndShowImage  BIO  DOM  DynamicLoadAddonFuns  DynamicWebTwain  EnumMouseButton
    Errors  Events  IntToColorStr  LS  OnGetImageByURL  OnGetImageFromServer  Path  ProgressBar  UI  Uri
    addEventListener  ajax  all  appendMessage  appendRichMessage  aryControlLoadImage  attachAddon  attachProperty
    base64  bio  cancelFrome  clearMessage  closeAll  closeProgress  colorStrToInt  config  css  currentStyle
    debug*/
  var detect: AnonSsl
  /*ignored
    detectButton  dialog  dialogShowStatus  dlgProgress  dlgRef  drawBoxBorder  drawImageWithHermite
    each  empty  endsWith
    */
  var env: AnonBChrome
  def NewOCRReadPara(): OCRReadPara
  def NewOCRZone(): OCRZone
  def NewRedaction(): Redaction
  def getScript(url: String, bAsync: Boolean, callback: js.Function0[Unit]): Unit
  /*ignored
    error  escapeHtml  escapeRegExp  extend  filter  fireEvent  fromUnicode  get  getColor  getCss
    getElDimensions  getHex  getHexColor  getHttpUrl  getLogger  getOffset  getRandom  getRealPath  getScript
    getWS  getWSUrl  getWheelDelta  globalEval  guid  hide  html5  imageControlCount  indexOf  install
    io  isArray  isBoolean  isDef  isFunction  isLocalIP  isNaN  isNull  isNumber  isObject
    isPlainObject  isString  isUndef  isUndefined  isWindow  keys  log  main  makeArray  mix
    needShowTwiceShowDialog  nil  noop  now  obj  one  page  param  parse  parseHTML  parser
    product  progressMessage  ready  removeEventListener  replaceAll  replaceControl  show  showProgress  startWS
    startWSByIP  startsWith  stopPropagation  stringify  style  support  switchEvent  tmp  toggle  trim
    type  unEscapeHtml  unparam  upperCaseFirst  urlDecode  urlEncode  utf8  win
    ...other internal ones
    */
  def hideMask(): Unit
  def showMask(): Unit
}

object DynamsoftLib {
  @scala.inline
  def apply(
    NewOCRReadPara: CallbackTo[OCRReadPara],
    NewOCRZone: CallbackTo[OCRZone],
    NewRedaction: CallbackTo[Redaction],
    detect: AnonSsl,
    env: AnonBChrome,
    getScript: (String, Boolean, js.Function0[Unit]) => Callback,
    hideMask: Callback,
    showMask: Callback
  ): DynamsoftLib = {
    val __obj = js.Dynamic.literal(detect = detect.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any])
    __obj.updateDynamic("NewOCRReadPara")(NewOCRReadPara.toJsFn)
    __obj.updateDynamic("NewOCRZone")(NewOCRZone.toJsFn)
    __obj.updateDynamic("NewRedaction")(NewRedaction.toJsFn)
    __obj.updateDynamic("getScript")(js.Any.fromFunction3((t0: java.lang.String, t1: scala.Boolean, t2: js.Function0[scala.Unit]) => getScript(t0, t1, t2).runNow()))
    __obj.updateDynamic("hideMask")(hideMask.toJsFn)
    __obj.updateDynamic("showMask")(showMask.toJsFn)
    __obj.asInstanceOf[DynamsoftLib]
  }
}

