package typingsJapgolly.materialComponentsWeb.mod

import org.scalajs.dom.raw.Element
import typingsJapgolly.materialTabIndicator.AnonACTIVE
import typingsJapgolly.materialTabIndicator.AnonCONTENTSELECTOR
import typingsJapgolly.materialTabIndicator.PartialMDCTabIndicatorAda
import typingsJapgolly.materialTabIndicator.adapterMod.MDCTabIndicatorAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "tabIndicator")
@js.native
object tabIndicator extends js.Object {
  @js.native
  class MDCFadingTabIndicatorFoundation ()
    extends typingsJapgolly.materialTabIndicator.fadingFoundationMod.MDCFadingTabIndicatorFoundation
  
  @js.native
  class MDCSlidingTabIndicatorFoundation ()
    extends typingsJapgolly.materialTabIndicator.slidingFoundationMod.MDCSlidingTabIndicatorFoundation
  
  @js.native
  class MDCTabIndicator ()
    extends typingsJapgolly.materialTabIndicator.mod.MDCTabIndicator
  
  @js.native
  abstract class MDCTabIndicatorFoundation ()
    extends typingsJapgolly.materialTabIndicator.mod.MDCTabIndicatorFoundation {
    def this(adapter: PartialMDCTabIndicatorAda) = this()
  }
  
  /* static members */
  @js.native
  object MDCTabIndicator extends js.Object {
    def attachTo(root: Element): typingsJapgolly.materialTabIndicator.componentMod.MDCTabIndicator = js.native
  }
  
  /* static members */
  @js.native
  object MDCTabIndicatorFoundation extends js.Object {
    val cssClasses: AnonACTIVE = js.native
    val defaultAdapter: MDCTabIndicatorAdapter = js.native
    val strings: AnonCONTENTSELECTOR = js.native
  }
  
  /**
    * @license
    * Copyright 2018 Google Inc.
    *
    * Permission is hereby granted, free of charge, to any person obtaining a copy
    * of this software and associated documentation files (the "Software"), to deal
    * in the Software without restriction, including without limitation the rights
    * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
    * copies of the Software, and to permit persons to whom the Software is
    * furnished to do so, subject to the following conditions:
    *
    * The above copyright notice and this permission notice shall be included in
    * all copies or substantial portions of the Software.
    *
    * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
    * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
    * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
    * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
    * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
    * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
    * THE SOFTWARE.
    */
  @js.native
  object cssClasses extends js.Object {
    var ACTIVE: String = js.native
    var FADE: String = js.native
    var NO_TRANSITION: String = js.native
  }
  
  @js.native
  object strings extends js.Object {
    var CONTENT_SELECTOR: String = js.native
  }
  
}

