package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.Exception
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * Accessible list box lists are used by list boxes as container for the list items. In addition of the simple container functionality of the {@link
  * AccessibleList} service the {@link com.sun.star.accessibility.XAccessibleSelection} interface is supported.
  * @since OOo 1.1.2
  */
type AccessibleListBoxList = AccessibleList

/**
  * An implementation which uses the message queue to call the callback implementation asynchronously.
  * @see XRequestCallback
  */
type AsyncCallback = XRequestCallback

/** specifies a provider for container windows implementing the {@link com.sun.star.awt.XWindow} interface. */
type ContainerWindowProvider = XContainerWindowProvider

/** specifies a provider for dialogs implementing the {@link com.sun.star.awt.XDialog} interface. */
type DialogProvider2 = XDialogProvider2

/**
  * describes a menu for top-level windows.
  *
  * A menu bar can only be used by top-level windows. They support the interface {@link com.sun.star.awt.XTopWindow} to set an menu bar object.
  */
type MenuBar = XMenuBar

/** @since LibreOffice 4.1 */
type Pointer = XPointer

/**
  * describes a popup menu which is a recursive container for commands
  *
  * A popup menu can be used as a standalone object to display a context menu. It's also possible to use a popup menu to integrate it into another menu.
  */
type PopupMenu = XPopupMenu

/**
  * fired if a resource cannot be locked.
  *
  * It is an error if the exception occurs in a non-transacted task. A transacted task repeats later.
  */
type PrinterException = Exception

/**
  * mechanism to discover and manage printers
  * @since LibreOffice 4.1
  */
type PrinterServer = XPrinterServer

/**
  * is a specialization of the {@link AnimatedImagesControlModel} .
  *
  * To show a progress which cannot be expressed as a percentage of execution, it displays animated images from a standard image set.
  *
  * Three image sets are provided, of size 16x16, 32x32, and 64x64 pixels.
  */
type SpinningProgressControlModel = AnimatedImagesControlModel

/** specifies a standard tab controller. */
type TabController = XTabController

/**
  * describes a toolkit that creates windows on a screen.
  *
  * The design of the interfaces for the toolkit implementation should be remote. This means that the calls to the interfaces of the toolkit should be
  * one-way. Too many synchronous calls kill the remote performance.
  */
type Toolkit = XToolkit2

/** specifies a dialog control. */
type UnoControlDialog = XUnoControlDialog

/**
  * specifies a file control.
  *
  * A file control extends the {@link UnoControlEdit} with a file dialog.
  */
type UnoControlFileControl = UnoControlEdit

/** specifies a fixed line control. */
type UnoControlFixedLine = UnoControl

/** specifies a group box control. */
type UnoControlGroupBox = UnoControl

/** identifies a control model. */
type XControlModel = XInterface

/**
  * specifies an object as a bitmap for which data is formatted for a specific output device.
  *
  * Drawing of this bitmap is only valid on a compatible device.
  */
type XDisplayBitmap = XInterface

/** identifies a menu bar. */
type XMenuBar = XMenu

/**
  * is supported by buttons which can be toggled between a "pressed" and an "unpressed" state
  *
  * Changes in the toggle state are broadcasted to {@link XItemListener} instances.
  */
type XToggleButton = XItemEventBroadcaster
