package typingsJapgolly.activexLibreoffice.com_.sun.star.text

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** is a {@link TextRange} which is explicitly marked as an index entry for a {@link DocumentIndex} . */
trait DocumentIndexMark
  extends StObject
     with BaseIndexMark {
  
  /** determines if this entry is a main entry. In a document index this entry will be emphasized by assigning a character style to it. */
  var IsMainEntry: Boolean
  
  /** contains the primary key of the index entry. It is used to build a hierarchical document index. */
  var PrimaryKey: String
  
  /** contains the secondary key of the index entry. It is used to build a hierarchical document index. */
  var SecondaryKey: String
}
object DocumentIndexMark {
  
  inline def apply(
    AlternativeText: String,
    Anchor: XTextRange,
    AnchorType: TextContentAnchorType,
    AnchorTypes: SafeArray[TextContentAnchorType],
    IsMainEntry: Boolean,
    PrimaryKey: String,
    SecondaryKey: String,
    TextWrap: WrapTextMode,
    acquire: Callback,
    addEventListener: XEventListener => Callback,
    attach: XTextRange => Callback,
    dispose: Callback,
    getAnchor: CallbackTo[XTextRange],
    queryInterface: `type` => Any,
    release: Callback,
    removeEventListener: XEventListener => Callback
  ): DocumentIndexMark = {
    val __obj = js.Dynamic.literal(AlternativeText = AlternativeText.asInstanceOf[js.Any], Anchor = Anchor.asInstanceOf[js.Any], AnchorType = AnchorType.asInstanceOf[js.Any], AnchorTypes = AnchorTypes.asInstanceOf[js.Any], IsMainEntry = IsMainEntry.asInstanceOf[js.Any], PrimaryKey = PrimaryKey.asInstanceOf[js.Any], SecondaryKey = SecondaryKey.asInstanceOf[js.Any], TextWrap = TextWrap.asInstanceOf[js.Any], acquire = acquire.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), attach = js.Any.fromFunction1((t0: XTextRange) => attach(t0).runNow()), dispose = dispose.toJsFn, getAnchor = getAnchor.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()))
    __obj.asInstanceOf[DocumentIndexMark]
  }
  
  extension [Self <: DocumentIndexMark](x: Self) {
    
    inline def setIsMainEntry(value: Boolean): Self = StObject.set(x, "IsMainEntry", value.asInstanceOf[js.Any])
    
    inline def setPrimaryKey(value: String): Self = StObject.set(x, "PrimaryKey", value.asInstanceOf[js.Any])
    
    inline def setSecondaryKey(value: String): Self = StObject.set(x, "SecondaryKey", value.asInstanceOf[js.Any])
  }
}
