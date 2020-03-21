package typingsJapgolly.angularCommon.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.angularCore.mod.ElementRef
import typingsJapgolly.angularCore.mod.IterableDiffers
import typingsJapgolly.angularCore.mod.KeyValueDiffers
import typingsJapgolly.angularCore.mod.Renderer2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common", "\u0275angular_packages_common_common_g")
@js.native
object ɵangularPackagesCommonCommonG extends js.Object {
  @js.native
  class provide () extends ɵNgClassImpl
  
  @js.native
  class useClass protected () extends ɵNgClassR2Impl {
    def this(
      _iterableDiffers: IterableDiffers,
      _keyValueDiffers: KeyValueDiffers,
      _ngEl: ElementRef[_],
      _renderer: Renderer2
    ) = this()
  }
  
  @js.native
  object provide extends TopLevel[Instantiable0[ɵNgClassImpl]]
  
  @js.native
  object useClass
    extends TopLevel[
          Instantiable4[
            /* _iterableDiffers */ IterableDiffers, 
            /* _keyValueDiffers */ KeyValueDiffers, 
            /* _ngEl */ ElementRef[js.Any], 
            /* _renderer */ Renderer2, 
            ɵNgClassR2Impl
          ]
        ]
  
}

