package typingsJapgolly.detox.mod.global.Detox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndexableNativeElement
  extends StObject
     with NativeElementActions {
  
  /**
    * Choose from multiple elements matching the same matcher using index
    * @example await element(by.text('Product')).atIndex(2).tap();
    */
  def atIndex(index: Double): NativeElement = js.native
}
