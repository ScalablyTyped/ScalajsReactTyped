package typingsJapgolly.googleEarth.global.google.earth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("google.earth.GEGeometryContainer")
@js.native
open class GEGeometryContainer ()
  extends StObject
     with typingsJapgolly.googleEarth.google.earth.GESchemaObjectContainer[typingsJapgolly.googleEarth.google.earth.KmlGeometry] {
  
  /**
    * Adds a node to the end of the list of children of a specified feature.
    * Returns the appended object.
    */
  /* CompleteClass */
  override def appendChild(`object`: typingsJapgolly.googleEarth.google.earth.KmlGeometry): Unit = js.native
  
  /**
    * List of features (for KmlContainer), or list of features, styles, and schemas (for KmlDocument).
    * Returns true if there are any child nodes.
    */
  /* CompleteClass */
  override def getChildNodes(): typingsJapgolly.googleEarth.google.earth.KmlObjectList[typingsJapgolly.googleEarth.google.earth.KmlGeometry] = js.native
  
  /**
    * First child in the list of objects.
    */
  /* CompleteClass */
  override def getFirstChild(): typingsJapgolly.googleEarth.google.earth.KmlGeometry = js.native
  
  /**
    * Last child in the list of objects.
    */
  /* CompleteClass */
  override def getLastChild(): typingsJapgolly.googleEarth.google.earth.KmlGeometry = js.native
  
  /**
    * Returns true if the container is not empty.
    */
  /* CompleteClass */
  override def hasChildNodes(): Boolean = js.native
  
  /**
    * Inserts a child before the referenced child in the list of objects.
    */
  /* CompleteClass */
  override def insertBefore(
    newChild: typingsJapgolly.googleEarth.google.earth.KmlGeometry,
    refChild: typingsJapgolly.googleEarth.google.earth.KmlGeometry
  ): Unit = js.native
  
  /**
    * Removes a node from the list of children of a specified object.
    */
  /* CompleteClass */
  override def removeChild(oldChild: typingsJapgolly.googleEarth.google.earth.KmlGeometry): Unit = js.native
  
  /**
    * Replaces existing child in the list of features.
    * Returns the old child.
    */
  /* CompleteClass */
  override def replaceChild(
    newChild: typingsJapgolly.googleEarth.google.earth.KmlGeometry,
    oldChild: typingsJapgolly.googleEarth.google.earth.KmlGeometry
  ): Unit = js.native
}
