package typingsJapgolly.ret

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTypesMod {
  
  @js.native
  sealed trait types extends StObject
  @JSImport("ret/dist/types/types", "types")
  @js.native
  object types extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[types & Double] = js.native
    
    @js.native
    sealed trait CHAR
      extends StObject
         with types
    /* 7 */ val CHAR: typingsJapgolly.ret.distTypesTypesMod.types.CHAR & Double = js.native
    
    @js.native
    sealed trait GROUP
      extends StObject
         with types
    /* 1 */ val GROUP: typingsJapgolly.ret.distTypesTypesMod.types.GROUP & Double = js.native
    
    @js.native
    sealed trait POSITION
      extends StObject
         with types
    /* 2 */ val POSITION: typingsJapgolly.ret.distTypesTypesMod.types.POSITION & Double = js.native
    
    @js.native
    sealed trait RANGE
      extends StObject
         with types
    /* 4 */ val RANGE: typingsJapgolly.ret.distTypesTypesMod.types.RANGE & Double = js.native
    
    @js.native
    sealed trait REFERENCE
      extends StObject
         with types
    /* 6 */ val REFERENCE: typingsJapgolly.ret.distTypesTypesMod.types.REFERENCE & Double = js.native
    
    @js.native
    sealed trait REPETITION
      extends StObject
         with types
    /* 5 */ val REPETITION: typingsJapgolly.ret.distTypesTypesMod.types.REPETITION & Double = js.native
    
    @js.native
    sealed trait ROOT
      extends StObject
         with types
    /* 0 */ val ROOT: typingsJapgolly.ret.distTypesTypesMod.types.ROOT & Double = js.native
    
    @js.native
    sealed trait SET
      extends StObject
         with types
    /* 3 */ val SET: typingsJapgolly.ret.distTypesTypesMod.types.SET & Double = js.native
  }
}
