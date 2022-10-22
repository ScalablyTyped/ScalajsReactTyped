package typingsJapgolly.activexLibreoffice.com_.sun.star.drawing

import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`3`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`4`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`5`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`6`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`7`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`8`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This enumeration defines the type of polygon. */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`6`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`5`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`4`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`3`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`8`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`7`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
*/
trait PolygonKind extends StObject
object PolygonKind {
  
  /** This is the PolygonKind for a ClosedFreeHandShape. */
  inline def FREEFILL: `6` = 6.asInstanceOf[`6`]
  
  /** This is the PolygonKind for an OpenFreeHandShape. */
  inline def FREELINE: `5` = 5.asInstanceOf[`5`]
  
  /**
    * the {@link ConnectorShape} is drawn as a straight line
    *
    * This is the PolygonKind for a {@link LineShape} .
    */
  inline def LINE: `0` = 0.asInstanceOf[`0`]
  
  /** This is the PolygonKind for a {@link ClosedBezierShape} . */
  inline def PATHFILL: `4` = 4.asInstanceOf[`4`]
  
  /** This is the PolygonKind for an {@link OpenBezierShape} . */
  inline def PATHLINE: `3` = 3.asInstanceOf[`3`]
  
  /** This is the PolygonKind for a PolyLinePathShape. */
  inline def PATHPLIN: `8` = 8.asInstanceOf[`8`]
  
  /** This is the PolygonKind for a PolyPolygonPathShape. */
  inline def PATHPOLY: `7` = 7.asInstanceOf[`7`]
  
  /** This is the PolygonKind for a {@link PolyLineShape} . */
  inline def PLIN: `2` = 2.asInstanceOf[`2`]
  
  /** This is the PolygonKind for a {@link PolyPolygonShape} . */
  inline def POLY: `1` = 1.asInstanceOf[`1`]
}
