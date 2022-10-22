package typingsJapgolly.dxf

import typingsJapgolly.dxf.commonMod.Point3D
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object handlersEntitiesMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.dxf.handlersEntityVertexMod.VertexEntityData
    - typingsJapgolly.dxf.handlersEntityTextMod.TextEntityData
    - typingsJapgolly.dxf.handlersEntitySplineMod.SplineEntityData
    - typingsJapgolly.dxf.handlersEntitySolidMod.SolidEntityData
    - typingsJapgolly.dxf.handlersEntityPolylineMod.PolylineEntityData
    - typingsJapgolly.dxf.handlersEntityPointMod.PointEntityData
    - typingsJapgolly.dxf.handlersEntityMtextMod.MTextEntityData
    - typingsJapgolly.dxf.handlersEntityLineMod.LineEntityData
    - typingsJapgolly.dxf.handlersEntityLwpolylineMod.LWPolylineEntityData
    - typingsJapgolly.dxf.handlersEntityInsertMod.InsertEntityData
    - typingsJapgolly.dxf.handlersEntityEllipseMod.EllipseEntityData
    - typingsJapgolly.dxf.handlersEntityDimensionMod.DimensionEntityData
    - typingsJapgolly.dxf.handlersEntityCircleMod.CircleEntityData
    - typingsJapgolly.dxf.handlersEntityArcMod.ArcEntityData
    - typingsJapgolly.dxf.handlersEntityThreedfaceMod.ThreeDFaceEntityData
  */
  trait Entity extends StObject
  object Entity {
    
    inline def ArcEntityData(endAngle: Double, startAngle: Double): typingsJapgolly.dxf.handlersEntityArcMod.ArcEntityData = {
      val __obj = js.Dynamic.literal(endAngle = endAngle.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.dxf.handlersEntityArcMod.ArcEntityData]
    }
    
    inline def CircleEntityData(): typingsJapgolly.dxf.handlersEntityCircleMod.CircleEntityData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.dxf.handlersEntityCircleMod.CircleEntityData]
    }
    
    inline def DimensionEntityData(
      attachementPoint: Any,
      block: Any,
      dimensionType: Any,
      end: Point3D,
      measureEnd: Point3D,
      measureStart: Point3D,
      start: Point3D,
      textMidpoint: Point3D
    ): typingsJapgolly.dxf.handlersEntityDimensionMod.DimensionEntityData = {
      val __obj = js.Dynamic.literal(attachementPoint = attachementPoint.asInstanceOf[js.Any], block = block.asInstanceOf[js.Any], dimensionType = dimensionType.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], measureEnd = measureEnd.asInstanceOf[js.Any], measureStart = measureStart.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], textMidpoint = textMidpoint.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.dxf.handlersEntityDimensionMod.DimensionEntityData]
    }
    
    inline def EllipseEntityData(endAngle: Double, startAngle: Double): typingsJapgolly.dxf.handlersEntityEllipseMod.EllipseEntityData = {
      val __obj = js.Dynamic.literal(endAngle = endAngle.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.dxf.handlersEntityEllipseMod.EllipseEntityData]
    }
    
    inline def InsertEntityData(
      block: Any,
      columnCount: Double,
      columnSpacing: Double,
      extrusionX: Any & js.UndefOr[Any],
      extrusionY: Any & js.UndefOr[Any],
      extrusionZ: Any & js.UndefOr[Any],
      rotation: Double,
      rowCount: Double,
      rowSpacing: Double,
      scaleX: Double,
      scaleY: Double,
      scaleZ: Double,
      x: Double,
      y: Double,
      z: Double
    ): typingsJapgolly.dxf.handlersEntityInsertMod.InsertEntityData = {
      val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], columnCount = columnCount.asInstanceOf[js.Any], columnSpacing = columnSpacing.asInstanceOf[js.Any], extrusionX = extrusionX.asInstanceOf[js.Any], extrusionY = extrusionY.asInstanceOf[js.Any], extrusionZ = extrusionZ.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], rowSpacing = rowSpacing.asInstanceOf[js.Any], scaleX = scaleX.asInstanceOf[js.Any], scaleY = scaleY.asInstanceOf[js.Any], scaleZ = scaleZ.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.dxf.handlersEntityInsertMod.InsertEntityData]
    }
    
    inline def LWPolylineEntityData(): typingsJapgolly.dxf.handlersEntityLwpolylineMod.LWPolylineEntityData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.dxf.handlersEntityLwpolylineMod.LWPolylineEntityData]
    }
    
    inline def LineEntityData(): typingsJapgolly.dxf.handlersEntityLineMod.LineEntityData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.dxf.handlersEntityLineMod.LineEntityData]
    }
    
    inline def MTextEntityData(): typingsJapgolly.dxf.handlersEntityMtextMod.MTextEntityData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.dxf.handlersEntityMtextMod.MTextEntityData]
    }
    
    inline def PointEntityData(): typingsJapgolly.dxf.handlersEntityPointMod.PointEntityData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.dxf.handlersEntityPointMod.PointEntityData]
    }
    
    inline def PolylineEntityData(): typingsJapgolly.dxf.handlersEntityPolylineMod.PolylineEntityData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.dxf.handlersEntityPolylineMod.PolylineEntityData]
    }
    
    inline def SolidEntityData(corners: js.Tuple4[Point3D, Point3D, Point3D, Point3D], thickness: Double): typingsJapgolly.dxf.handlersEntitySolidMod.SolidEntityData = {
      val __obj = js.Dynamic.literal(corners = corners.asInstanceOf[js.Any], thickness = thickness.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.dxf.handlersEntitySolidMod.SolidEntityData]
    }
    
    inline def SplineEntityData(controlPoints: js.Array[Point3D], knots: Double): typingsJapgolly.dxf.handlersEntitySplineMod.SplineEntityData = {
      val __obj = js.Dynamic.literal(controlPoints = controlPoints.asInstanceOf[js.Any], knots = knots.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.dxf.handlersEntitySplineMod.SplineEntityData]
    }
    
    inline def TextEntityData(): typingsJapgolly.dxf.handlersEntityTextMod.TextEntityData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.dxf.handlersEntityTextMod.TextEntityData]
    }
    
    inline def ThreeDFaceEntityData(vertices: js.Tuple4[Point3D, Point3D, Point3D, Point3D]): typingsJapgolly.dxf.handlersEntityThreedfaceMod.ThreeDFaceEntityData = {
      val __obj = js.Dynamic.literal(vertices = vertices.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.dxf.handlersEntityThreedfaceMod.ThreeDFaceEntityData]
    }
    
    inline def VertexEntityData(): typingsJapgolly.dxf.handlersEntityVertexMod.VertexEntityData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.dxf.handlersEntityVertexMod.VertexEntityData]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.dxf.dxfStrings.POINT
    - typingsJapgolly.dxf.dxfStrings.LINE
    - typingsJapgolly.dxf.dxfStrings.LWPOLYLINE
    - typingsJapgolly.dxf.dxfStrings.POLYLINE
    - typingsJapgolly.dxf.dxfStrings.VERTEX
    - typingsJapgolly.dxf.dxfStrings.ARC
    - typingsJapgolly.dxf.dxfStrings.CIRCLE
    - typingsJapgolly.dxf.dxfStrings.ELLIPSE
    - typingsJapgolly.dxf.dxfStrings.SPLINE
    - typingsJapgolly.dxf.dxfStrings.SOLID
    - typingsJapgolly.dxf.dxfStrings.TEXT
    - typingsJapgolly.dxf.dxfStrings.MTEXT
    - typingsJapgolly.dxf.dxfStrings.INSERT
    - typingsJapgolly.dxf.dxfStrings.`3DFACE`
    - typingsJapgolly.dxf.dxfStrings.DIMENSION
  */
  trait EntityType extends StObject
  object EntityType {
    
    inline def `3DFACE`: typingsJapgolly.dxf.dxfStrings.`3DFACE` = "3DFACE".asInstanceOf[typingsJapgolly.dxf.dxfStrings.`3DFACE`]
    
    inline def ARC: typingsJapgolly.dxf.dxfStrings.ARC = "ARC".asInstanceOf[typingsJapgolly.dxf.dxfStrings.ARC]
    
    inline def CIRCLE: typingsJapgolly.dxf.dxfStrings.CIRCLE = "CIRCLE".asInstanceOf[typingsJapgolly.dxf.dxfStrings.CIRCLE]
    
    inline def DIMENSION: typingsJapgolly.dxf.dxfStrings.DIMENSION = "DIMENSION".asInstanceOf[typingsJapgolly.dxf.dxfStrings.DIMENSION]
    
    inline def ELLIPSE: typingsJapgolly.dxf.dxfStrings.ELLIPSE = "ELLIPSE".asInstanceOf[typingsJapgolly.dxf.dxfStrings.ELLIPSE]
    
    inline def INSERT: typingsJapgolly.dxf.dxfStrings.INSERT = "INSERT".asInstanceOf[typingsJapgolly.dxf.dxfStrings.INSERT]
    
    inline def LINE: typingsJapgolly.dxf.dxfStrings.LINE = "LINE".asInstanceOf[typingsJapgolly.dxf.dxfStrings.LINE]
    
    inline def LWPOLYLINE: typingsJapgolly.dxf.dxfStrings.LWPOLYLINE = "LWPOLYLINE".asInstanceOf[typingsJapgolly.dxf.dxfStrings.LWPOLYLINE]
    
    inline def MTEXT: typingsJapgolly.dxf.dxfStrings.MTEXT = "MTEXT".asInstanceOf[typingsJapgolly.dxf.dxfStrings.MTEXT]
    
    inline def POINT: typingsJapgolly.dxf.dxfStrings.POINT = "POINT".asInstanceOf[typingsJapgolly.dxf.dxfStrings.POINT]
    
    inline def POLYLINE: typingsJapgolly.dxf.dxfStrings.POLYLINE = "POLYLINE".asInstanceOf[typingsJapgolly.dxf.dxfStrings.POLYLINE]
    
    inline def SOLID: typingsJapgolly.dxf.dxfStrings.SOLID = "SOLID".asInstanceOf[typingsJapgolly.dxf.dxfStrings.SOLID]
    
    inline def SPLINE: typingsJapgolly.dxf.dxfStrings.SPLINE = "SPLINE".asInstanceOf[typingsJapgolly.dxf.dxfStrings.SPLINE]
    
    inline def TEXT: typingsJapgolly.dxf.dxfStrings.TEXT = "TEXT".asInstanceOf[typingsJapgolly.dxf.dxfStrings.TEXT]
    
    inline def VERTEX: typingsJapgolly.dxf.dxfStrings.VERTEX = "VERTEX".asInstanceOf[typingsJapgolly.dxf.dxfStrings.VERTEX]
  }
  
  type LayerGroupedEntities = Record[String, Entity]
}
