package typingsJapgolly.materialComponentsWeb.mod

import org.scalajs.dom.raw.Element
import typingsJapgolly.materialTabScroller.AnonANIMATING
import typingsJapgolly.materialTabScroller.AnonAREASELECTOR
import typingsJapgolly.materialTabScroller.PartialMDCTabScrollerAdap
import typingsJapgolly.materialTabScroller.adapterMod.MDCTabScrollerAdapter
import typingsJapgolly.std.Document_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "tabScroller")
@js.native
object tabScroller extends js.Object {
  @js.native
  class MDCTabScroller ()
    extends typingsJapgolly.materialTabScroller.mod.MDCTabScroller
  
  @js.native
  class MDCTabScrollerFoundation ()
    extends typingsJapgolly.materialTabScroller.mod.MDCTabScrollerFoundation {
    def this(adapter: PartialMDCTabScrollerAdap) = this()
  }
  
  /* static members */
  @js.native
  object MDCTabScroller extends js.Object {
    def attachTo(root: Element): typingsJapgolly.materialTabScroller.componentMod.MDCTabScroller = js.native
  }
  
  /* static members */
  @js.native
  object MDCTabScrollerFoundation extends js.Object {
    val cssClasses: AnonANIMATING = js.native
    val defaultAdapter: MDCTabScrollerAdapter = js.native
    val strings: AnonAREASELECTOR = js.native
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
    var ANIMATING: String = js.native
    var SCROLL_AREA_SCROLL: String = js.native
    var SCROLL_TEST: String = js.native
  }
  
  @js.native
  object strings extends js.Object {
    var AREA_SELECTOR: String = js.native
    var CONTENT_SELECTOR: String = js.native
  }
  
  @js.native
  object util extends js.Object {
    def computeHorizontalScrollbarHeight(documentObj: Document_): Double = js.native
    def computeHorizontalScrollbarHeight(documentObj: Document_, shouldCacheResult: Boolean): Double = js.native
  }
  
}

