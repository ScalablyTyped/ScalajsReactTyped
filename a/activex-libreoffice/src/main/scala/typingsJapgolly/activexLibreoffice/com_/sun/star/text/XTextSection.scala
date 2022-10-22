package typingsJapgolly.activexLibreoffice.com_.sun.star.text

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provide special data of a {@link TextSection} .
  * @see TextSection
  */
trait XTextSection
  extends StObject
     with XTextContent {
  
  /** @returns all text sections that are children of this text section (recursive). */
  val ChildSections: SafeArray[XTextSection]
  
  /** If the object is a child section, then this method returns the parent text section. */
  val ParentSection: XTextSection
  
  /** @returns all text sections that are children of this text section (recursive). */
  def getChildSections(): SafeArray[XTextSection]
  
  /** If the object is a child section, then this method returns the parent text section. */
  def getParentSection(): XTextSection
}
object XTextSection {
  
  inline def apply(
    Anchor: XTextRange,
    ChildSections: SafeArray[XTextSection],
    ParentSection: XTextSection,
    acquire: Callback,
    addEventListener: XEventListener => Callback,
    attach: XTextRange => Callback,
    dispose: Callback,
    getAnchor: CallbackTo[XTextRange],
    getChildSections: CallbackTo[SafeArray[XTextSection]],
    getParentSection: CallbackTo[XTextSection],
    queryInterface: `type` => Any,
    release: Callback,
    removeEventListener: XEventListener => Callback
  ): XTextSection = {
    val __obj = js.Dynamic.literal(Anchor = Anchor.asInstanceOf[js.Any], ChildSections = ChildSections.asInstanceOf[js.Any], ParentSection = ParentSection.asInstanceOf[js.Any], acquire = acquire.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), attach = js.Any.fromFunction1((t0: XTextRange) => attach(t0).runNow()), dispose = dispose.toJsFn, getAnchor = getAnchor.toJsFn, getChildSections = getChildSections.toJsFn, getParentSection = getParentSection.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()))
    __obj.asInstanceOf[XTextSection]
  }
  
  extension [Self <: XTextSection](x: Self) {
    
    inline def setChildSections(value: SafeArray[XTextSection]): Self = StObject.set(x, "ChildSections", value.asInstanceOf[js.Any])
    
    inline def setGetChildSections(value: CallbackTo[SafeArray[XTextSection]]): Self = StObject.set(x, "getChildSections", value.toJsFn)
    
    inline def setGetParentSection(value: CallbackTo[XTextSection]): Self = StObject.set(x, "getParentSection", value.toJsFn)
    
    inline def setParentSection(value: XTextSection): Self = StObject.set(x, "ParentSection", value.asInstanceOf[js.Any])
  }
}
