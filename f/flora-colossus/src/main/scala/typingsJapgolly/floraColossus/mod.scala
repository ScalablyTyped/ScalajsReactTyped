package typingsJapgolly.floraColossus

import typingsJapgolly.floraColossus.libDepTypesMod.DepType
import typingsJapgolly.floraColossus.libDepTypesMod.DepType.DEV
import typingsJapgolly.floraColossus.libDepTypesMod.DepType.DEV_OPTIONAL
import typingsJapgolly.floraColossus.libDepTypesMod.DepType.OPTIONAL
import typingsJapgolly.floraColossus.libDepTypesMod.DepType.PROD
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("flora-colossus", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("flora-colossus", "DepType")
  @js.native
  object DepType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.floraColossus.libDepTypesMod.DepType & Double] = js.native
    
    /* 1 */ val DEV: typingsJapgolly.floraColossus.libDepTypesMod.DepType.DEV & Double = js.native
    
    /* 3 */ val DEV_OPTIONAL: typingsJapgolly.floraColossus.libDepTypesMod.DepType.DEV_OPTIONAL & Double = js.native
    
    /* 2 */ val OPTIONAL: typingsJapgolly.floraColossus.libDepTypesMod.DepType.OPTIONAL & Double = js.native
    
    /* 0 */ val PROD: typingsJapgolly.floraColossus.libDepTypesMod.DepType.PROD & Double = js.native
    
    /* 4 */ val ROOT: typingsJapgolly.floraColossus.libDepTypesMod.DepType.ROOT & Double = js.native
  }
  
  @JSImport("flora-colossus", "Walker")
  @js.native
  open class Walker protected ()
    extends typingsJapgolly.floraColossus.libWalkerMod.Walker {
    def this(modulePath: String) = this()
  }
  
  inline def childDepType(parentType: DepType, childType: DepType): PROD | DEV | OPTIONAL | DEV_OPTIONAL = (^.asInstanceOf[js.Dynamic].applyDynamic("childDepType")(parentType.asInstanceOf[js.Any], childType.asInstanceOf[js.Any])).asInstanceOf[PROD | DEV | OPTIONAL | DEV_OPTIONAL]
  
  inline def depTypeGreater(newType: DepType, existing: DepType): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("depTypeGreater")(newType.asInstanceOf[js.Any], existing.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
