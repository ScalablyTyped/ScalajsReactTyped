package typingsJapgolly.typeormAuroraDataApiDriver

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTestFunctionalPgBasicEntitySimpleEnumEntityMod {
  
  @js.native
  sealed trait HeterogeneousEnum extends StObject
  @JSImport("typeorm-aurora-data-api-driver/dist/types/test/functional/pg/basic/entity/SimpleEnumEntity", "HeterogeneousEnum")
  @js.native
  object HeterogeneousEnum extends StObject {
    
    @JSBracketAccess
    def apply(value: Double | String): js.UndefOr[HeterogeneousEnum & (Double | String)] = js.native
    
    @js.native
    sealed trait NO
      extends StObject
         with HeterogeneousEnum
    /* 0 */ val NO: typingsJapgolly.typeormAuroraDataApiDriver.distTypesTestFunctionalPgBasicEntitySimpleEnumEntityMod.HeterogeneousEnum.NO & (Double | String) = js.native
    
    @js.native
    sealed trait YES
      extends StObject
         with HeterogeneousEnum
    /* "YES" */ val YES: typingsJapgolly.typeormAuroraDataApiDriver.distTypesTestFunctionalPgBasicEntitySimpleEnumEntityMod.HeterogeneousEnum.YES & (Double | String) = js.native
  }
  
  @js.native
  sealed trait NumericEnum extends StObject
  @JSImport("typeorm-aurora-data-api-driver/dist/types/test/functional/pg/basic/entity/SimpleEnumEntity", "NumericEnum")
  @js.native
  object NumericEnum extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[NumericEnum & Double] = js.native
    
    @js.native
    sealed trait ADMIN
      extends StObject
         with NumericEnum
    /* 0 */ val ADMIN: typingsJapgolly.typeormAuroraDataApiDriver.distTypesTestFunctionalPgBasicEntitySimpleEnumEntityMod.NumericEnum.ADMIN & Double = js.native
    
    @js.native
    sealed trait EDITOR
      extends StObject
         with NumericEnum
    /* 1 */ val EDITOR: typingsJapgolly.typeormAuroraDataApiDriver.distTypesTestFunctionalPgBasicEntitySimpleEnumEntityMod.NumericEnum.EDITOR & Double = js.native
    
    @js.native
    sealed trait GHOST
      extends StObject
         with NumericEnum
    /* 3 */ val GHOST: typingsJapgolly.typeormAuroraDataApiDriver.distTypesTestFunctionalPgBasicEntitySimpleEnumEntityMod.NumericEnum.GHOST & Double = js.native
    
    @js.native
    sealed trait MODERATOR
      extends StObject
         with NumericEnum
    /* 2 */ val MODERATOR: typingsJapgolly.typeormAuroraDataApiDriver.distTypesTestFunctionalPgBasicEntitySimpleEnumEntityMod.NumericEnum.MODERATOR & Double = js.native
  }
  
  @JSImport("typeorm-aurora-data-api-driver/dist/types/test/functional/pg/basic/entity/SimpleEnumEntity", "SimpleEnumEntity")
  @js.native
  open class SimpleEnumEntity () extends StObject {
    
    var arrayDefinedNumericEnum: ArrayDefinedNumericEnumType = js.native
    
    var arrayDefinedStringEnum: ArrayDefinedStringEnumType = js.native
    
    var enumWithoutdefault: StringEnum = js.native
    
    var heterogeneousEnum: HeterogeneousEnum = js.native
    
    var id: Double = js.native
    
    var numericEnum: NumericEnum = js.native
    
    var numericSimpleEnum: NumericEnum = js.native
    
    var stringEnum: StringEnum = js.native
    
    var stringNumericEnum: StringNumericEnum = js.native
  }
  
  @js.native
  sealed trait StringEnum extends StObject
  @JSImport("typeorm-aurora-data-api-driver/dist/types/test/functional/pg/basic/entity/SimpleEnumEntity", "StringEnum")
  @js.native
  object StringEnum extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[StringEnum & String] = js.native
    
    @js.native
    sealed trait ADMIN
      extends StObject
         with StringEnum
    /* "a" */ val ADMIN: typingsJapgolly.typeormAuroraDataApiDriver.distTypesTestFunctionalPgBasicEntitySimpleEnumEntityMod.StringEnum.ADMIN & String = js.native
    
    @js.native
    sealed trait EDITOR
      extends StObject
         with StringEnum
    /* "e" */ val EDITOR: typingsJapgolly.typeormAuroraDataApiDriver.distTypesTestFunctionalPgBasicEntitySimpleEnumEntityMod.StringEnum.EDITOR & String = js.native
    
    @js.native
    sealed trait GHOST
      extends StObject
         with StringEnum
    /* "g" */ val GHOST: typingsJapgolly.typeormAuroraDataApiDriver.distTypesTestFunctionalPgBasicEntitySimpleEnumEntityMod.StringEnum.GHOST & String = js.native
    
    @js.native
    sealed trait MODERATOR
      extends StObject
         with StringEnum
    /* "m" */ val MODERATOR: typingsJapgolly.typeormAuroraDataApiDriver.distTypesTestFunctionalPgBasicEntitySimpleEnumEntityMod.StringEnum.MODERATOR & String = js.native
  }
  
  @js.native
  sealed trait StringNumericEnum extends StObject
  @JSImport("typeorm-aurora-data-api-driver/dist/types/test/functional/pg/basic/entity/SimpleEnumEntity", "StringNumericEnum")
  @js.native
  object StringNumericEnum extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[StringNumericEnum & String] = js.native
    
    @js.native
    sealed trait FOUR
      extends StObject
         with StringNumericEnum
    /* "4" */ val FOUR: typingsJapgolly.typeormAuroraDataApiDriver.distTypesTestFunctionalPgBasicEntitySimpleEnumEntityMod.StringNumericEnum.FOUR & String = js.native
    
    @js.native
    sealed trait ONE
      extends StObject
         with StringNumericEnum
    /* "1" */ val ONE: typingsJapgolly.typeormAuroraDataApiDriver.distTypesTestFunctionalPgBasicEntitySimpleEnumEntityMod.StringNumericEnum.ONE & String = js.native
    
    @js.native
    sealed trait THREE
      extends StObject
         with StringNumericEnum
    /* "3" */ val THREE: typingsJapgolly.typeormAuroraDataApiDriver.distTypesTestFunctionalPgBasicEntitySimpleEnumEntityMod.StringNumericEnum.THREE & String = js.native
    
    @js.native
    sealed trait TWO
      extends StObject
         with StringNumericEnum
    /* "2" */ val TWO: typingsJapgolly.typeormAuroraDataApiDriver.distTypesTestFunctionalPgBasicEntitySimpleEnumEntityMod.StringNumericEnum.TWO & String = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.typeormAuroraDataApiDriver.typeormAuroraDataApiDriverInts.`11`
    - typingsJapgolly.typeormAuroraDataApiDriver.typeormAuroraDataApiDriverInts.`12`
    - typingsJapgolly.typeormAuroraDataApiDriver.typeormAuroraDataApiDriverInts.`13`
  */
  trait ArrayDefinedNumericEnumType extends StObject
  object ArrayDefinedNumericEnumType {
    
    inline def `11`: typingsJapgolly.typeormAuroraDataApiDriver.typeormAuroraDataApiDriverInts.`11` = 11.asInstanceOf[typingsJapgolly.typeormAuroraDataApiDriver.typeormAuroraDataApiDriverInts.`11`]
    
    inline def `12`: typingsJapgolly.typeormAuroraDataApiDriver.typeormAuroraDataApiDriverInts.`12` = 12.asInstanceOf[typingsJapgolly.typeormAuroraDataApiDriver.typeormAuroraDataApiDriverInts.`12`]
    
    inline def `13`: typingsJapgolly.typeormAuroraDataApiDriver.typeormAuroraDataApiDriverInts.`13` = 13.asInstanceOf[typingsJapgolly.typeormAuroraDataApiDriver.typeormAuroraDataApiDriverInts.`13`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.typeormAuroraDataApiDriver.typeormAuroraDataApiDriverStrings.admin
    - typingsJapgolly.typeormAuroraDataApiDriver.typeormAuroraDataApiDriverStrings.editor
    - typingsJapgolly.typeormAuroraDataApiDriver.typeormAuroraDataApiDriverStrings.ghost
  */
  trait ArrayDefinedStringEnumType extends StObject
  object ArrayDefinedStringEnumType {
    
    inline def admin: typingsJapgolly.typeormAuroraDataApiDriver.typeormAuroraDataApiDriverStrings.admin = "admin".asInstanceOf[typingsJapgolly.typeormAuroraDataApiDriver.typeormAuroraDataApiDriverStrings.admin]
    
    inline def editor: typingsJapgolly.typeormAuroraDataApiDriver.typeormAuroraDataApiDriverStrings.editor = "editor".asInstanceOf[typingsJapgolly.typeormAuroraDataApiDriver.typeormAuroraDataApiDriverStrings.editor]
    
    inline def ghost: typingsJapgolly.typeormAuroraDataApiDriver.typeormAuroraDataApiDriverStrings.ghost = "ghost".asInstanceOf[typingsJapgolly.typeormAuroraDataApiDriver.typeormAuroraDataApiDriverStrings.ghost]
  }
}
