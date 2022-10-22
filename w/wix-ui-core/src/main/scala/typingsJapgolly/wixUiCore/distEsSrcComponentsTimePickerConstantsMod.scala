package typingsJapgolly.wixUiCore

import typingsJapgolly.wixUiCore.anon.Am
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsTimePickerConstantsMod {
  
  @js.native
  sealed trait AmPmOptions extends StObject
  @JSImport("wix-ui-core/dist/es/src/components/time-picker/constants", "AmPmOptions")
  @js.native
  object AmPmOptions extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[AmPmOptions & String] = js.native
    
    @js.native
    sealed trait Capitalized
      extends StObject
         with AmPmOptions
    /* "capitalized" */ val Capitalized: typingsJapgolly.wixUiCore.distEsSrcComponentsTimePickerConstantsMod.AmPmOptions.Capitalized & String = js.native
    
    @js.native
    sealed trait Lowercase
      extends StObject
         with AmPmOptions
    /* "lowercase" */ val Lowercase: typingsJapgolly.wixUiCore.distEsSrcComponentsTimePickerConstantsMod.AmPmOptions.Lowercase & String = js.native
    
    @js.native
    sealed trait None
      extends StObject
         with AmPmOptions
    /* "none" */ val None: typingsJapgolly.wixUiCore.distEsSrcComponentsTimePickerConstantsMod.AmPmOptions.None & String = js.native
    
    @js.native
    sealed trait Uppercase
      extends StObject
         with AmPmOptions
    /* "uppercase" */ val Uppercase: typingsJapgolly.wixUiCore.distEsSrcComponentsTimePickerConstantsMod.AmPmOptions.Uppercase & String = js.native
  }
  
  object AmPmStrings {
    
    @JSImport("wix-ui-core/dist/es/src/components/time-picker/constants", "AmPmStrings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/dist/es/src/components/time-picker/constants", "AmPmStrings.capitalized")
    @js.native
    def capitalized: Am = js.native
    inline def capitalized_=(x: Am): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("capitalized")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/es/src/components/time-picker/constants", "AmPmStrings.lowercase")
    @js.native
    def lowercase: Am = js.native
    inline def lowercase_=(x: Am): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lowercase")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/es/src/components/time-picker/constants", "AmPmStrings.uppercase")
    @js.native
    def uppercase: Am = js.native
    inline def uppercase_=(x: Am): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uppercase")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("wix-ui-core/dist/es/src/components/time-picker/constants", "BLANK")
  @js.native
  val BLANK: /* "--" */ String = js.native
  
  @js.native
  sealed trait FIELD extends StObject
  @JSImport("wix-ui-core/dist/es/src/components/time-picker/constants", "FIELD")
  @js.native
  object FIELD extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[FIELD & Double] = js.native
    
    @js.native
    sealed trait AFTER
      extends StObject
         with FIELD
    /* 4 */ val AFTER: typingsJapgolly.wixUiCore.distEsSrcComponentsTimePickerConstantsMod.FIELD.AFTER & Double = js.native
    
    @js.native
    sealed trait AMPM
      extends StObject
         with FIELD
    /* 3 */ val AMPM: typingsJapgolly.wixUiCore.distEsSrcComponentsTimePickerConstantsMod.FIELD.AMPM & Double = js.native
    
    @js.native
    sealed trait BEFORE
      extends StObject
         with FIELD
    /* 0 */ val BEFORE: typingsJapgolly.wixUiCore.distEsSrcComponentsTimePickerConstantsMod.FIELD.BEFORE & Double = js.native
    
    @js.native
    sealed trait HOUR
      extends StObject
         with FIELD
    /* 1 */ val HOUR: typingsJapgolly.wixUiCore.distEsSrcComponentsTimePickerConstantsMod.FIELD.HOUR & Double = js.native
    
    @js.native
    sealed trait MINUTE
      extends StObject
         with FIELD
    /* 2 */ val MINUTE: typingsJapgolly.wixUiCore.distEsSrcComponentsTimePickerConstantsMod.FIELD.MINUTE & Double = js.native
  }
  
  @JSImport("wix-ui-core/dist/es/src/components/time-picker/constants", "NULL_TIME")
  @js.native
  val NULL_TIME: String = js.native
}
