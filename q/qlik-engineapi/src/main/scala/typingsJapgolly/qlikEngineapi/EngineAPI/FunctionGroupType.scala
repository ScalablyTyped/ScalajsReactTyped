package typingsJapgolly.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
trait FunctionGroupType extends StObject
object FunctionGroupType {
  
  inline def AGGR: typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.AGGR = "AGGR".asInstanceOf[typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.AGGR]
  
  inline def ALL: typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.ALL = "ALL".asInstanceOf[typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.ALL]
  
  inline def CLR: typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.CLR = "CLR".asInstanceOf[typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.CLR]
  
  inline def CND: typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.CND = "CND".asInstanceOf[typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.CND]
  
  inline def COUNT: typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.COUNT = "COUNT".asInstanceOf[typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.COUNT]
  
  inline def DATE: typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.DATE = "DATE".asInstanceOf[typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.DATE]
  
  inline def EXP: typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.EXP = "EXP".asInstanceOf[typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.EXP]
  
  inline def EXT: typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.EXT = "EXT".asInstanceOf[typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.EXT]
  
  inline def FILE: typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.FILE = "FILE".asInstanceOf[typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.FILE]
  
  inline def FIN: typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.FIN = "FIN".asInstanceOf[typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.FIN]
  
  inline def FRMT: typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.FRMT = "FRMT".asInstanceOf[typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.FRMT]
  
  inline def GEO: typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.GEO = "GEO".asInstanceOf[typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.GEO]
  
  inline def LOG: typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.LOG = "LOG".asInstanceOf[typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.LOG]
  
  inline def MAPP: typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.MAPP = "MAPP".asInstanceOf[typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.MAPP]
  
  inline def MATH: typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.MATH = "MATH".asInstanceOf[typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.MATH]
  
  inline def NONE: typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.NONE = "NONE".asInstanceOf[typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.NONE]
  
  inline def NULL: typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.NULL = "NULL".asInstanceOf[typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.NULL]
  
  inline def NUM: typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.NUM = "NUM".asInstanceOf[typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.NUM]
  
  inline def NUMI: typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.NUMI = "NUMI".asInstanceOf[typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.NUMI]
  
  inline def RCRD: typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.RCRD = "RCRD".asInstanceOf[typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.RCRD]
  
  inline def RNG: typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.RNG = "RNG".asInstanceOf[typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.RNG]
  
  inline def RNK: typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.RNK = "RNK".asInstanceOf[typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.RNK]
  
  inline def STR: typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.STR = "STR".asInstanceOf[typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.STR]
  
  inline def SYS: typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.SYS = "SYS".asInstanceOf[typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.SYS]
  
  inline def TBL: typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.TBL = "TBL".asInstanceOf[typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.TBL]
  
  inline def TRIG: typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.TRIG = "TRIG".asInstanceOf[typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.TRIG]
  
  inline def U: typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.U = "U".asInstanceOf[typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.U]
}
