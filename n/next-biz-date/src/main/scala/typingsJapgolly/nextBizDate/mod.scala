package typingsJapgolly.nextBizDate

import typingsJapgolly.moment.mod.Moment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("next-biz-date", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def FindBizDate(candidateDate: Moment, holidaysArray: js.Array[String]): Moment = (^.asInstanceOf[js.Dynamic].applyDynamic("FindBizDate")(candidateDate.asInstanceOf[js.Any], holidaysArray.asInstanceOf[js.Any])).asInstanceOf[Moment]
  inline def FindBizDate(candidateDate: Moment, holidaysArray: js.Array[String], direction: Direction): Moment = (^.asInstanceOf[js.Dynamic].applyDynamic("FindBizDate")(candidateDate.asInstanceOf[js.Any], holidaysArray.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[Moment]
  
  inline def FindNextBizDate(baseDate: String, holidaysArray: js.Array[String]): Moment = (^.asInstanceOf[js.Dynamic].applyDynamic("FindNextBizDate")(baseDate.asInstanceOf[js.Any], holidaysArray.asInstanceOf[js.Any])).asInstanceOf[Moment]
  inline def FindNextBizDate(baseDate: String, holidaysArray: js.Array[String], countTarget: Double): Moment = (^.asInstanceOf[js.Dynamic].applyDynamic("FindNextBizDate")(baseDate.asInstanceOf[js.Any], holidaysArray.asInstanceOf[js.Any], countTarget.asInstanceOf[js.Any])).asInstanceOf[Moment]
  inline def FindNextBizDate(baseDate: String, holidaysArray: js.Array[String], countTarget: Double, direction: Direction): Moment = (^.asInstanceOf[js.Dynamic].applyDynamic("FindNextBizDate")(baseDate.asInstanceOf[js.Any], holidaysArray.asInstanceOf[js.Any], countTarget.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[Moment]
  inline def FindNextBizDate(baseDate: String, holidaysArray: js.Array[String], countTarget: Unit, direction: Direction): Moment = (^.asInstanceOf[js.Dynamic].applyDynamic("FindNextBizDate")(baseDate.asInstanceOf[js.Any], holidaysArray.asInstanceOf[js.Any], countTarget.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[Moment]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.nextBizDate.nextBizDateStrings.FORWARD
    - typingsJapgolly.nextBizDate.nextBizDateStrings.BACKWARDS
  */
  trait Direction extends StObject
  object Direction {
    
    inline def BACKWARDS: typingsJapgolly.nextBizDate.nextBizDateStrings.BACKWARDS = "BACKWARDS".asInstanceOf[typingsJapgolly.nextBizDate.nextBizDateStrings.BACKWARDS]
    
    inline def FORWARD: typingsJapgolly.nextBizDate.nextBizDateStrings.FORWARD = "FORWARD".asInstanceOf[typingsJapgolly.nextBizDate.nextBizDateStrings.FORWARD]
  }
}
