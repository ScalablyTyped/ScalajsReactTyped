package typingsJapgolly.jqueryAjaxfile.mochaMod

import typingsJapgolly.jqueryAjaxfile.AnonClose
import typingsJapgolly.jqueryAjaxfile.Mocha_.IRunner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mocha", "reporters")
@js.native
object reporters extends js.Object {
  @js.native
  class Base protected ()
    extends typingsJapgolly.jqueryAjaxfile.Mocha_.reporters.Base {
    def this(runner: IRunner) = this()
  }
  
  @js.native
  class Doc ()
    extends typingsJapgolly.jqueryAjaxfile.Mocha_.reporters.Base
  
  @js.native
  class Dot ()
    extends typingsJapgolly.jqueryAjaxfile.Mocha_.reporters.Base
  
  @js.native
  class HTML ()
    extends typingsJapgolly.jqueryAjaxfile.Mocha_.reporters.Base
  
  @js.native
  class HTMLCov ()
    extends typingsJapgolly.jqueryAjaxfile.Mocha_.reporters.Base
  
  @js.native
  class JSON ()
    extends typingsJapgolly.jqueryAjaxfile.Mocha_.reporters.Base
  
  @js.native
  class JSONCov ()
    extends typingsJapgolly.jqueryAjaxfile.Mocha_.reporters.Base
  
  @js.native
  class JSONStream ()
    extends typingsJapgolly.jqueryAjaxfile.Mocha_.reporters.Base
  
  @js.native
  class Landing ()
    extends typingsJapgolly.jqueryAjaxfile.Mocha_.reporters.Base
  
  @js.native
  class List ()
    extends typingsJapgolly.jqueryAjaxfile.Mocha_.reporters.Base
  
  @js.native
  class Markdown ()
    extends typingsJapgolly.jqueryAjaxfile.Mocha_.reporters.Base
  
  @js.native
  class Min ()
    extends typingsJapgolly.jqueryAjaxfile.Mocha_.reporters.Base
  
  @js.native
  class Nyan ()
    extends typingsJapgolly.jqueryAjaxfile.Mocha_.reporters.Base
  
  @js.native
  class Progress protected ()
    extends typingsJapgolly.jqueryAjaxfile.Mocha_.reporters.Progress {
    /**
      * @param options.open String used to indicate the start of the progress bar.
      * @param options.complete String used to indicate a complete test on the progress bar.
      * @param options.incomplete String used to indicate an incomplete test on the progress bar.
      * @param options.close String used to indicate the end of the progress bar.
      */
    def this(runner: IRunner) = this()
    def this(runner: IRunner, options: AnonClose) = this()
  }
  
  @js.native
  class Spec ()
    extends typingsJapgolly.jqueryAjaxfile.Mocha_.reporters.Base
  
  @js.native
  class TAP ()
    extends typingsJapgolly.jqueryAjaxfile.Mocha_.reporters.Base
  
  @js.native
  class XUnit protected ()
    extends typingsJapgolly.jqueryAjaxfile.Mocha_.reporters.XUnit {
    def this(runner: IRunner) = this()
    def this(runner: IRunner, options: js.Any) = this()
  }
  
}

