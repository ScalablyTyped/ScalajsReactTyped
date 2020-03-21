package typingsJapgolly.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * One of:
  * - ALL for FUNC_GROUP_ALL,
  * - U for FUNC_GROUP_UNKNOWN,
  * - NONE for FUNC_GROUP_NONE,
  * - AGGR for FUNC_GROUP_AGGR,
  * - NUM for FUNC_GROUP_NUMERIC,
  * - RNG for FUNC_GROUP_RANGE,
  * - EXP for FUNC_GROUP_EXPONENTIAL_AND_LOGARITHMIC,
  * - TRIG for FUNC_GROUP_TRIGONOMETRIC_AND_HYPERBOLIC,
  * - FIN for FUNC_GROUP_FINANCIAL,
  * - MATH for FUNC_GROUP_MATH_CONSTANT_AND_PARAM_FREE,
  * - COUNT for FUNC_GROUP_COUNTER,
  * - STR for FUNC_GROUP_STRING,
  * - MAPP for FUNC_GROUP_MAPPING,
  * - RCRD for FUNC_GROUP_INTER_RECORD,
  * - CND for FUNC_GROUP_CONDITIONAL,
  * - LOG for FUNC_GROUP_LOGICAL,
  * - NULL for FUNC_GROUP_NULL,
  * - SYS for FUNC_GROUP_SYSTEM,
  * - FILE for FUNC_GROUP_FILE,
  * - TBL for FUNC_GROUP_TABLE,
  * - DATE for FUNC_GROUP_DATE_AND_TIME,
  * - NUMI for FUNC_GROUP_NUMBER_INTERPRET,
  * - FRMT for FUNC_GROUP_FORMATTING,
  * - CLR for FUNC_GROUP_COLOR,
  * - RNK for FUNC_GROUP_RANKING
  * - GEO for FUNC_GROUP_GEO
  * - EXT for FUNC_GROUP_EXTERNAL
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.ALL
  - typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.U
  - typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.NONE
  - typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.AGGR
  - typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.NUM
  - typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.RNG
  - typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.EXP
  - typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.TRIG
  - typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.FIN
  - typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.MATH
  - typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.COUNT
  - typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.STR
  - typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.MAPP
  - typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.RCRD
  - typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.CND
  - typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.LOG
  - typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.NULL
  - typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.SYS
  - typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.FILE
  - typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.TBL
  - typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.DATE
  - typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.NUMI
  - typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.FRMT
  - typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.CLR
  - typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.RNK
  - typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.GEO
  - typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.EXT
*/
trait FunctionGroupType extends js.Object

object FunctionGroupType {
  @scala.inline
  def AGGR: typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.AGGR = this.cast("AGGR")
  @scala.inline
  def ALL: typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.ALL = this.cast("ALL")
  @scala.inline
  def CLR: typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.CLR = this.cast("CLR")
  @scala.inline
  def CND: typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.CND = this.cast("CND")
  @scala.inline
  def COUNT: typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.COUNT = this.cast("COUNT")
  @scala.inline
  def DATE: typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.DATE = this.cast("DATE")
  @scala.inline
  def EXP: typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.EXP = this.cast("EXP")
  @scala.inline
  def EXT: typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.EXT = this.cast("EXT")
  @scala.inline
  def FILE: typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.FILE = this.cast("FILE")
  @scala.inline
  def FIN: typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.FIN = this.cast("FIN")
  @scala.inline
  def FRMT: typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.FRMT = this.cast("FRMT")
  @scala.inline
  def GEO: typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.GEO = this.cast("GEO")
  @scala.inline
  def LOG: typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.LOG = this.cast("LOG")
  @scala.inline
  def MAPP: typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.MAPP = this.cast("MAPP")
  @scala.inline
  def MATH: typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.MATH = this.cast("MATH")
  @scala.inline
  def NONE: typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.NONE = this.cast("NONE")
  @scala.inline
  def NULL: typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.NULL = this.cast("NULL")
  @scala.inline
  def NUM: typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.NUM = this.cast("NUM")
  @scala.inline
  def NUMI: typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.NUMI = this.cast("NUMI")
  @scala.inline
  def RCRD: typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.RCRD = this.cast("RCRD")
  @scala.inline
  def RNG: typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.RNG = this.cast("RNG")
  @scala.inline
  def RNK: typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.RNK = this.cast("RNK")
  @scala.inline
  def STR: typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.STR = this.cast("STR")
  @scala.inline
  def SYS: typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.SYS = this.cast("SYS")
  @scala.inline
  def TBL: typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.TBL = this.cast("TBL")
  @scala.inline
  def TRIG: typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.TRIG = this.cast("TRIG")
  @scala.inline
  def U: typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.U = this.cast("U")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

