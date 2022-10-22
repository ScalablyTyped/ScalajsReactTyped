package typingsJapgolly.vsoNodeApi

import typingsJapgolly.vsoNodeApi.anon.EnumValuesMonday
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfacesCommonSystemMod {
  
  @js.native
  sealed trait DayOfWeek extends StObject
  @JSImport("vso-node-api/interfaces/common/System", "DayOfWeek")
  @js.native
  object DayOfWeek extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[DayOfWeek & Double] = js.native
    
    /**
      * Indicates Friday.
      */
    @js.native
    sealed trait Friday
      extends StObject
         with DayOfWeek
    /* 5 */ val Friday: typingsJapgolly.vsoNodeApi.interfacesCommonSystemMod.DayOfWeek.Friday & Double = js.native
    
    /**
      * Indicates Monday.
      */
    @js.native
    sealed trait Monday
      extends StObject
         with DayOfWeek
    /* 1 */ val Monday: typingsJapgolly.vsoNodeApi.interfacesCommonSystemMod.DayOfWeek.Monday & Double = js.native
    
    /**
      * Indicates Saturday.
      */
    @js.native
    sealed trait Saturday
      extends StObject
         with DayOfWeek
    /* 6 */ val Saturday: typingsJapgolly.vsoNodeApi.interfacesCommonSystemMod.DayOfWeek.Saturday & Double = js.native
    
    /**
      * Indicates Sunday.
      */
    @js.native
    sealed trait Sunday
      extends StObject
         with DayOfWeek
    /* 0 */ val Sunday: typingsJapgolly.vsoNodeApi.interfacesCommonSystemMod.DayOfWeek.Sunday & Double = js.native
    
    /**
      * Indicates Thursday.
      */
    @js.native
    sealed trait Thursday
      extends StObject
         with DayOfWeek
    /* 4 */ val Thursday: typingsJapgolly.vsoNodeApi.interfacesCommonSystemMod.DayOfWeek.Thursday & Double = js.native
    
    /**
      * Indicates Tuesday.
      */
    @js.native
    sealed trait Tuesday
      extends StObject
         with DayOfWeek
    /* 2 */ val Tuesday: typingsJapgolly.vsoNodeApi.interfacesCommonSystemMod.DayOfWeek.Tuesday & Double = js.native
    
    /**
      * Indicates Wednesday.
      */
    @js.native
    sealed trait Wednesday
      extends StObject
         with DayOfWeek
    /* 3 */ val Wednesday: typingsJapgolly.vsoNodeApi.interfacesCommonSystemMod.DayOfWeek.Wednesday & Double = js.native
  }
  
  object TypeInfo {
    
    @JSImport("vso-node-api/interfaces/common/System", "TypeInfo")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("vso-node-api/interfaces/common/System", "TypeInfo.DayOfWeek")
    @js.native
    def DayOfWeek: EnumValuesMonday = js.native
    inline def DayOfWeek_=(x: EnumValuesMonday): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DayOfWeek")(x.asInstanceOf[js.Any])
  }
}
