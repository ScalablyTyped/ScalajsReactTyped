package typingsJapgolly.rcCascader

import typingsJapgolly.rcCascader.cascaderMod.CascaderProps
import typingsJapgolly.rcCascader.cascaderMod.CascaderState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-cascader/lib", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class default protected ()
    extends typingsJapgolly.rcCascader.cascaderMod.default {
    def this(props: CascaderProps) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var defaultProps: CascaderProps = js.native
    def getDerivedStateFromProps(nextProps: CascaderProps, prevState: CascaderState): CascaderState = js.native
  }
  
}

