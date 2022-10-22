package typingsJapgolly.oracleOraclejet

import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.abbreviated
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.narrow
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.wide
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ojlocaledataMod {
  
  @JSImport("@oracle/oraclejet/ojlocaledata", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDayNames(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDayNames")().asInstanceOf[js.Array[String]]
  inline def getDayNames(`type`: abbreviated | narrow | wide): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDayNames")(`type`.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def getFirstDayOfWeek(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getFirstDayOfWeek")().asInstanceOf[Double]
  
  inline def getMonthNames(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMonthNames")().asInstanceOf[js.Array[String]]
  inline def getMonthNames(`type`: abbreviated | narrow | wide): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMonthNames")(`type`.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def getWeekendEnd(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getWeekendEnd")().asInstanceOf[Double]
  
  inline def getWeekendStart(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getWeekendStart")().asInstanceOf[Double]
  
  inline def isMonthPriorToYear(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMonthPriorToYear")().asInstanceOf[Boolean]
  
  inline def setBundle(bundle: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setBundle")(bundle.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
