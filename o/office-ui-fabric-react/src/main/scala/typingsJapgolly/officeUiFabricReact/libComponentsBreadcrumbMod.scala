package typingsJapgolly.officeUiFabricReact

import typingsJapgolly.officeUiFabricReact.libComponentsBreadcrumbBreadcrumbDottypesMod.IBreadcrumbProps
import typingsJapgolly.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsBreadcrumbMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Breadcrumb", "Breadcrumb")
  @js.native
  val Breadcrumb: FunctionComponent[IBreadcrumbProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/Breadcrumb", "BreadcrumbBase")
  @js.native
  open class BreadcrumbBase protected ()
    extends typingsJapgolly.officeUiFabricReact.libComponentsBreadcrumbBreadcrumbDotbaseMod.BreadcrumbBase {
    def this(props: IBreadcrumbProps) = this()
  }
  /* static members */
  object BreadcrumbBase {
    
    @JSImport("office-ui-fabric-react/lib/components/Breadcrumb", "BreadcrumbBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/Breadcrumb", "BreadcrumbBase.defaultProps")
    @js.native
    def defaultProps: IBreadcrumbProps = js.native
    inline def defaultProps_=(x: IBreadcrumbProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
