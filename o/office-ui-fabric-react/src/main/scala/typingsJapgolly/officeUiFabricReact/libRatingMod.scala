package typingsJapgolly.officeUiFabricReact

import typingsJapgolly.officeUiFabricReact.libComponentsRatingRatingDottypesMod.IRatingProps
import typingsJapgolly.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRatingMod {
  
  @JSImport("office-ui-fabric-react/lib/Rating", "Rating")
  @js.native
  val Rating: FunctionComponent[IRatingProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/Rating", "RatingBase")
  @js.native
  open class RatingBase protected ()
    extends typingsJapgolly.officeUiFabricReact.libComponentsRatingMod.RatingBase {
    def this(props: IRatingProps) = this()
  }
  /* static members */
  object RatingBase {
    
    @JSImport("office-ui-fabric-react/lib/Rating", "RatingBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/Rating", "RatingBase.defaultProps")
    @js.native
    def defaultProps: IRatingProps = js.native
    inline def defaultProps_=(x: IRatingProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/Rating", "RatingSize")
  @js.native
  object RatingSize extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.officeUiFabricReact.libComponentsRatingRatingDottypesMod.RatingSize & Double
      ] = js.native
    
    /* 1 */ val Large: typingsJapgolly.officeUiFabricReact.libComponentsRatingRatingDottypesMod.RatingSize.Large & Double = js.native
    
    /* 0 */ val Small: typingsJapgolly.officeUiFabricReact.libComponentsRatingRatingDottypesMod.RatingSize.Small & Double = js.native
  }
}
