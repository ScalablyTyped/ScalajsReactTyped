package typingsJapgolly.wixUiCore

import typingsJapgolly.wixUiCore.anon.Am
import typingsJapgolly.wixUiCore.anon.Field
import typingsJapgolly.wixUiCore.anon.Hour
import typingsJapgolly.wixUiCore.anon.Step
import typingsJapgolly.wixUiCore.anon.Strings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsTimePickerMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/time-picker", "TimePicker")
  @js.native
  open class TimePicker protected ()
    extends typingsJapgolly.wixUiCore.distEsSrcComponentsTimePickerTimePickerMod.TimePicker {
    def this(props: Any) = this()
  }
  /* static members */
  object TimePicker {
    
    @JSImport("wix-ui-core/dist/es/src/components/time-picker", "TimePicker")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/dist/es/src/components/time-picker", "TimePicker.defaultProps")
    @js.native
    def defaultProps: Step = js.native
    inline def defaultProps_=(x: Step): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/es/src/components/time-picker", "TimePicker.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  object TimePickerConstants {
    
    @JSImport("wix-ui-core/dist/es/src/components/time-picker", "TimePickerConstants.AmPmOptions")
    @js.native
    object AmPmOptions extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[
            typingsJapgolly.wixUiCore.distEsSrcComponentsTimePickerConstantsMod.AmPmOptions & String
          ] = js.native
      
      /* "capitalized" */ val Capitalized: typingsJapgolly.wixUiCore.distEsSrcComponentsTimePickerConstantsMod.AmPmOptions.Capitalized & String = js.native
      
      /* "lowercase" */ val Lowercase: typingsJapgolly.wixUiCore.distEsSrcComponentsTimePickerConstantsMod.AmPmOptions.Lowercase & String = js.native
      
      /* "none" */ val None: typingsJapgolly.wixUiCore.distEsSrcComponentsTimePickerConstantsMod.AmPmOptions.None & String = js.native
      
      /* "uppercase" */ val Uppercase: typingsJapgolly.wixUiCore.distEsSrcComponentsTimePickerConstantsMod.AmPmOptions.Uppercase & String = js.native
    }
    
    object AmPmStrings {
      
      @JSImport("wix-ui-core/dist/es/src/components/time-picker", "TimePickerConstants.AmPmStrings")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("wix-ui-core/dist/es/src/components/time-picker", "TimePickerConstants.AmPmStrings.capitalized")
      @js.native
      def capitalized: Am = js.native
      inline def capitalized_=(x: Am): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("capitalized")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-ui-core/dist/es/src/components/time-picker", "TimePickerConstants.AmPmStrings.lowercase")
      @js.native
      def lowercase: Am = js.native
      inline def lowercase_=(x: Am): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lowercase")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-ui-core/dist/es/src/components/time-picker", "TimePickerConstants.AmPmStrings.uppercase")
      @js.native
      def uppercase: Am = js.native
      inline def uppercase_=(x: Am): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uppercase")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("wix-ui-core/dist/es/src/components/time-picker", "TimePickerConstants.BLANK")
    @js.native
    val BLANK: /* "--" */ String = js.native
    
    @JSImport("wix-ui-core/dist/es/src/components/time-picker", "TimePickerConstants.FIELD")
    @js.native
    object FIELD extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typingsJapgolly.wixUiCore.distEsSrcComponentsTimePickerConstantsMod.FIELD & Double
          ] = js.native
      
      /* 4 */ val AFTER: typingsJapgolly.wixUiCore.distEsSrcComponentsTimePickerConstantsMod.FIELD.AFTER & Double = js.native
      
      /* 3 */ val AMPM: typingsJapgolly.wixUiCore.distEsSrcComponentsTimePickerConstantsMod.FIELD.AMPM & Double = js.native
      
      /* 0 */ val BEFORE: typingsJapgolly.wixUiCore.distEsSrcComponentsTimePickerConstantsMod.FIELD.BEFORE & Double = js.native
      
      /* 1 */ val HOUR: typingsJapgolly.wixUiCore.distEsSrcComponentsTimePickerConstantsMod.FIELD.HOUR & Double = js.native
      
      /* 2 */ val MINUTE: typingsJapgolly.wixUiCore.distEsSrcComponentsTimePickerConstantsMod.FIELD.MINUTE & Double = js.native
    }
    
    @JSImport("wix-ui-core/dist/es/src/components/time-picker", "TimePickerConstants.NULL_TIME")
    @js.native
    val NULL_TIME: String = js.native
  }
  
  object TimePickerUtils {
    
    @JSImport("wix-ui-core/dist/es/src/components/time-picker", "TimePickerUtils")
    @js.native
    val ^ : js.Any = js.native
    
    inline def convertToAmPm(hasValueStrings: Strings): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToAmPm")(hasValueStrings.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def decrement(hasValueFieldStep: Field): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decrement")(hasValueFieldStep.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def getFieldFromPos(pos: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getFieldFromPos")(pos.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def increment(hasValueFieldStep: Field): String = ^.asInstanceOf[js.Dynamic].applyDynamic("increment")(hasValueFieldStep.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def isValidTime(timeStr: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidTime")(timeStr.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def isValidTime(timeStr: String, useAmPm: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValidTime")(timeStr.asInstanceOf[js.Any], useAmPm.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def leftpad(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("leftpad")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def leftpad(str: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("leftpad")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def parseTime(timeStr: String): Hour = ^.asInstanceOf[js.Dynamic].applyDynamic("parseTime")(timeStr.asInstanceOf[js.Any]).asInstanceOf[Hour]
  }
}
