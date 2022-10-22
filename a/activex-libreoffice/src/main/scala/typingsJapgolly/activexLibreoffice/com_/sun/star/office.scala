package typingsJapgolly.activexLibreoffice.com_.sun.star

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XFastPropertySet
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.geometry.RealPoint2D
import typingsJapgolly.activexLibreoffice.com_.sun.star.geometry.RealSize2D
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XComponent
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.text.XText
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.DateTime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object office {
  
  /** @since LibreOffice 4.2 */
  trait Quickstart
    extends StObject
       with XFastPropertySet {
    
    /** The first two parameters are ignored */
    def createAndSetVeto(p1: Boolean, p2: Boolean, DisableVeto: Boolean): Unit
    
    def createAutoStart(bQuickstart: Boolean, bAutostart: Boolean): Unit
    
    def createDefault(): Unit
    
    def createStart(bQuickstart: Boolean): Unit
  }
  object Quickstart {
    
    inline def apply(
      acquire: Callback,
      createAndSetVeto: (Boolean, Boolean, Boolean) => Callback,
      createAutoStart: (Boolean, Boolean) => Callback,
      createDefault: Callback,
      createStart: Boolean => Callback,
      getFastPropertyValue: Double => Any,
      queryInterface: `type` => Any,
      release: Callback,
      setFastPropertyValue: (Double, Any) => Callback
    ): Quickstart = {
      val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, createAndSetVeto = js.Any.fromFunction3((t0: Boolean, t1: Boolean, t2: Boolean) => (createAndSetVeto(t0, t1, t2)).runNow()), createAutoStart = js.Any.fromFunction2((t0: Boolean, t1: Boolean) => (createAutoStart(t0, t1)).runNow()), createDefault = createDefault.toJsFn, createStart = js.Any.fromFunction1((t0: Boolean) => createStart(t0).runNow()), getFastPropertyValue = js.Any.fromFunction1(getFastPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setFastPropertyValue = js.Any.fromFunction2((t0: Double, t1: Any) => (setFastPropertyValue(t0, t1)).runNow()))
      __obj.asInstanceOf[Quickstart]
    }
    
    extension [Self <: Quickstart](x: Self) {
      
      inline def setCreateAndSetVeto(value: (Boolean, Boolean, Boolean) => Callback): Self = StObject.set(x, "createAndSetVeto", js.Any.fromFunction3((t0: Boolean, t1: Boolean, t2: Boolean) => (value(t0, t1, t2)).runNow()))
      
      inline def setCreateAutoStart(value: (Boolean, Boolean) => Callback): Self = StObject.set(x, "createAutoStart", js.Any.fromFunction2((t0: Boolean, t1: Boolean) => (value(t0, t1)).runNow()))
      
      inline def setCreateDefault(value: Callback): Self = StObject.set(x, "createDefault", value.toJsFn)
      
      inline def setCreateStart(value: Boolean => Callback): Self = StObject.set(x, "createStart", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    }
  }
  
  /** This interface gives access to an annotation inside a document. */
  trait XAnnotation
    extends StObject
       with XPropertySet
       with XComponent {
    
    /** a reference to the document content this annotation is anchored to. */
    var Anchor: Any
    
    /** stores the full name of the author who created this annotation. */
    var Author: String
    
    /** stores the date and time this annotation was last edited. */
    var DateTime: typingsJapgolly.activexLibreoffice.com_.sun.star.util.DateTime
    
    /** stores the initials of the author who created this annotation. */
    var Initials: String
    
    /**
      * this is an optional position that gives the user interface a hint where the annotation should be rendered. This could be an offset to the annotations
      * anchor.
      */
    var Position: RealPoint2D
    
    /** this is an optional size that gives the user interface a hint how large the annotation should be rendered. */
    var Size: RealSize2D
    
    /** gives access to the annotations text. */
    var TextRange: XText
  }
  object XAnnotation {
    
    inline def apply(
      Anchor: Any,
      Author: String,
      DateTime: DateTime,
      Initials: String,
      Position: RealPoint2D,
      PropertySetInfo: XPropertySetInfo,
      Size: RealSize2D,
      TextRange: XText,
      acquire: Callback,
      addEventListener: XEventListener => Callback,
      addPropertyChangeListener: (String, XPropertyChangeListener) => Callback,
      addVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
      dispose: Callback,
      getPropertySetInfo: CallbackTo[XPropertySetInfo],
      getPropertyValue: String => Any,
      queryInterface: `type` => Any,
      release: Callback,
      removeEventListener: XEventListener => Callback,
      removePropertyChangeListener: (String, XPropertyChangeListener) => Callback,
      removeVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
      setPropertyValue: (String, Any) => Callback
    ): XAnnotation = {
      val __obj = js.Dynamic.literal(Anchor = Anchor.asInstanceOf[js.Any], Author = Author.asInstanceOf[js.Any], DateTime = DateTime.asInstanceOf[js.Any], Initials = Initials.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], TextRange = TextRange.asInstanceOf[js.Any], acquire = acquire.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), addPropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), dispose = dispose.toJsFn, getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), removePropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), setPropertyValue = js.Any.fromFunction2((t0: String, t1: Any) => (setPropertyValue(t0, t1)).runNow()))
      __obj.asInstanceOf[XAnnotation]
    }
    
    extension [Self <: XAnnotation](x: Self) {
      
      inline def setAnchor(value: Any): Self = StObject.set(x, "Anchor", value.asInstanceOf[js.Any])
      
      inline def setAuthor(value: String): Self = StObject.set(x, "Author", value.asInstanceOf[js.Any])
      
      inline def setDateTime(value: DateTime): Self = StObject.set(x, "DateTime", value.asInstanceOf[js.Any])
      
      inline def setInitials(value: String): Self = StObject.set(x, "Initials", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: RealPoint2D): Self = StObject.set(x, "Position", value.asInstanceOf[js.Any])
      
      inline def setSize(value: RealSize2D): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
      
      inline def setTextRange(value: XText): Self = StObject.set(x, "TextRange", value.asInstanceOf[js.Any])
    }
  }
  
  /** This interface gives access to the annotation for a document content. */
  trait XAnnotationAccess extends StObject {
    
    /** creates a new annotation and inserts it into the document content. */
    def createAndInsertAnnotation(): XAnnotation
    
    /** @returns a new enumeration object for this annotation container. It returns NULL if there are no objects in this container. */
    def createAnnotationEnumeration(): XAnnotationEnumeration
    
    /** removes the annotation from this document content. */
    def removeAnnotation(annotation: XAnnotation): Unit
  }
  object XAnnotationAccess {
    
    inline def apply(
      createAndInsertAnnotation: CallbackTo[XAnnotation],
      createAnnotationEnumeration: CallbackTo[XAnnotationEnumeration],
      removeAnnotation: XAnnotation => Callback
    ): XAnnotationAccess = {
      val __obj = js.Dynamic.literal(createAndInsertAnnotation = createAndInsertAnnotation.toJsFn, createAnnotationEnumeration = createAnnotationEnumeration.toJsFn, removeAnnotation = js.Any.fromFunction1((t0: XAnnotation) => removeAnnotation(t0).runNow()))
      __obj.asInstanceOf[XAnnotationAccess]
    }
    
    extension [Self <: XAnnotationAccess](x: Self) {
      
      inline def setCreateAndInsertAnnotation(value: CallbackTo[XAnnotation]): Self = StObject.set(x, "createAndInsertAnnotation", value.toJsFn)
      
      inline def setCreateAnnotationEnumeration(value: CallbackTo[XAnnotationEnumeration]): Self = StObject.set(x, "createAnnotationEnumeration", value.toJsFn)
      
      inline def setRemoveAnnotation(value: XAnnotation => Callback): Self = StObject.set(x, "removeAnnotation", js.Any.fromFunction1((t0: XAnnotation) => value(t0).runNow()))
    }
  }
  
  /** An enumeration for a set of annotations. */
  trait XAnnotationEnumeration extends StObject {
    
    /** tests whether this enumeration contains more elements. */
    def hasMoreElements(): Boolean
    
    /**
      * @returns the next element of this enumeration.
      * @throws NoSuchElementException if no more elements exist.
      */
    def nextElement(): XAnnotation
  }
  object XAnnotationEnumeration {
    
    inline def apply(hasMoreElements: CallbackTo[Boolean], nextElement: CallbackTo[XAnnotation]): XAnnotationEnumeration = {
      val __obj = js.Dynamic.literal(hasMoreElements = hasMoreElements.toJsFn, nextElement = nextElement.toJsFn)
      __obj.asInstanceOf[XAnnotationEnumeration]
    }
    
    extension [Self <: XAnnotationEnumeration](x: Self) {
      
      inline def setHasMoreElements(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasMoreElements", value.toJsFn)
      
      inline def setNextElement(value: CallbackTo[XAnnotation]): Self = StObject.set(x, "nextElement", value.toJsFn)
    }
  }
}
